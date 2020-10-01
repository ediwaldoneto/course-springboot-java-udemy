package br.com.project.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import br.com.project.entities.User;
import br.com.project.repositories.UserRepository;
import br.com.project.services.exceptions.DatabaseException;
import br.com.project.services.exceptions.ResourceNotFoundException;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public List<User> findAll() {

		return userRepository.findAll();
	}

	public User findById(Long id) {
		Optional<User> obj = userRepository.findById(id);
		return obj.get();

	}

	public User insert(User user) {
		return userRepository.save(user);
	}

	public void delete(Long id) {

		try {
			userRepository.deleteById(id);
		} catch (EmptyResultDataAccessException e) {
			throw new ResourceNotFoundException(id);
		} catch (DataIntegrityViolationException e) {
			throw new DatabaseException(e.getMessage());
		}
	}

	public User update(Long id, User obj) {

		User aux = userRepository.getOne(id);
		updateData(aux, obj);
		return userRepository.save(aux);

	}

	public void updateData(User optional, User obj) {

		optional.setName(obj.getName());
		optional.setEmail(obj.getEmail());
		optional.setPhone(obj.getPhone());
		optional.setPassword(obj.getPassword());

	}
}