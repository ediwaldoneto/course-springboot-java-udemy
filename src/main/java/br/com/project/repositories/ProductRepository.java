package br.com.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.project.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
