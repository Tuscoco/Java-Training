package entities;

import java.time.LocalDateTime;
import entities.enums.OrderStatus;

public class Order {

	private int id;
	private LocalDateTime moment;
	private OrderStatus status;
	
	public Order() {}
	
	public Order(int id, LocalDateTime moment, OrderStatus status) {
		
		this.id = id;
		this.moment = moment;
		this.status = status;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDateTime getMoment() {
		return moment;
	}

	public void setMoment(LocalDateTime moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", moment=" + moment + ", status=" + status + "]";
	}
	
}
