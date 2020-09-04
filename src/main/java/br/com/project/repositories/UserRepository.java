package br.com.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.project.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
