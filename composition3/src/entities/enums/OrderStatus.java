package entities.enums;

public enum OrderStatus {
	
	PENDING_PAYMENT(1),
	PROCESSING(2),
	SHIPPED(3),
	DELIVERED(4);

	private int status;
	
	OrderStatus(int i) {
		this.status=i;
	}

	public int getStatus() {
		return status;
	}
	
}
