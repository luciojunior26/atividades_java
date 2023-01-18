package entities;

public class Account {

		private int number;
		private String holder;
		private double balance;
		private final double TAX = 5.0;
		
		public Account(int number, String holder, double balance) {
			this.number = number;
			this.holder = holder;
			this.balance = balance;
		}
		public Account(int number, String holder) {
			this.number = number;
			this.holder = holder;
			this.balance = 0;
		}
		
		public void deposit(double value) {
			this.balance += value;
		}
		
		public void withdraw(double value) {
			this.balance -= value + TAX;
		}
				
		
		public int getNumber() {
			return number;
		}
		public String getHolder() {
			return holder;
		}
		public void setHolder(String holder) {
			this.holder = holder;
		}
		public double getBalance() {
			return balance;
		}
		
		@Override
		public String toString() {
			return "Account [number=" + number + ", holder=" + holder + ", balance=" + balance + "]";
		}
	

}
