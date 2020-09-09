package br.com.project.entities;

import br.com.project.entities.pk.OrderItemPK;

public class OrderItem {

	private OrderItemPK id;
	private Integer quantity;
	private Double price;

	public OrderItem() {
	}

	public OrderItem(Integer quantity, Double price) {
		super();
		this.quantity = quantity;
		this.price = price;
	}
	
	
}
