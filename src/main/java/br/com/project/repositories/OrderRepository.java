package br.com.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.project.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
