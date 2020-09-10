package br.com.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.project.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
