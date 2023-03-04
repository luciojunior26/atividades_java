package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdfBirth = new SimpleDateFormat("dd/MM/yyy");
		SimpleDateFormat sdfOrder = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
				
		System.out.println("Enter cliente data: ");
		System.out.print("Name: ");
		String name = sc.next();
		System.out.print("Email: ");
		sc.nextLine();
		String email = sc.next();
		System.out.print("Birth date (DD/MM/YYYY: ");
		Date birth = sdfBirth.parse(sc.next());
		Client client = new Client(name, email, birth);
		
		System.out.println("Enter order data: ");
		System.out.print("Status: ");
		OrderStatus status = OrderStatus.valueOf(sc.next());
		
		System.out.print("How many items to this order? ");
		int n = sc.nextInt();
		Order order = new Order(new Date(), status, client); 
		String orderItems = "";
		for (int i=1; i<=n; i++) {
			System.out.println("Enter #" + i + " item data: ");
			System.out.print("Product name: ");
			String pName = sc.next();
			System.out.print("Product price: ");
			Double pPrice = sc.nextDouble();
			System.out.print("Quantity: ");
			Integer pQuantity = sc.nextInt();
			Product product = new Product(pName, pPrice);
			OrderItem orderItem = new OrderItem(pQuantity, product);
			order.addItem(orderItem);
			orderItems += (pName + ", $" + pPrice + ", Quantity: " + pQuantity + ", Subtotal: $" + orderItem.subTotal()+"\n"); 
		}
				
		System.out.println();
		System.out.println("ORDER SUMMARY: ");
		System.out.println("Order moment: " + sdfOrder.format(order.getMoment()));
		System.out.println("Order Status: " + order.getStatus());
		System.out.println("Cliente: " + client.getName() + " (" + sdfBirth.format(client.getBirthDate()) + ") " + " - " + client.getEmail());
		System.out.println("Order items: ");
		System.out.println(orderItems);
		System.out.println("Total price: $" + order.total());		
		sc.close();
		
		
		

	}

}
