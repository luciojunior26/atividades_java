package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
	
	private Date moment;
	private OrderStatus status;
	private Client client;
	private List<OrderItem> items = new ArrayList<>();
	
	SimpleDateFormat sdfOrder = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	public Order() {
	}

	public Order(Date moment, OrderStatus status, Client client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}

	public void addItem(OrderItem orderItem) {
		this.items.add(orderItem);		
	}
	
	public void removeItem(OrderItem orderItem) {
		this.items.remove(orderItem);
	}
	
	public Double total() {
//		Double sum = 0.0;
//		for (OrderItem c : items) {
//			sum += c.subTotal();
//		}
//		return sum;
		
		return items.stream().mapToDouble(n -> n.subTotal()).sum();
	}
	
	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public List<OrderItem> getItems() {
		return items;
	}
	
}
