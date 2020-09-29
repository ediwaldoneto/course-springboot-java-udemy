package br.com.project.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.project.entities.User;
import br.com.project.repositories.UserRepository;
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
		return obj.orElseThrow(() -> new ResourceNotFoundException(id));

	}

	public User insert(User user) {
		return userRepository.save(user);
	}

	public void delete(Long id) {

		userRepository.deleteById(id);
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