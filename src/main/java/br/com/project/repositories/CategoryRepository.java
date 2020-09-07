package br.com.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.project.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
