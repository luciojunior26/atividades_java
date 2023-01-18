package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Account;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter account number: ");
		int number = sc.nextInt();
		
		System.out.println("Enter account holder: ");
		String holder = sc.next();
		
		System.out.println("Is there na inicial deposit (y/n)?");
		String condDep = sc.next();
		Account account;		
				
		if (condDep.toLowerCase().equals("y")) {
			System.out.println("Enter incial deposit value: ");
			double balance = sc.nextDouble();
			account = new Account(number, holder, balance);
		} else {
			account = new Account(number, holder);
		}
						
		System.out.println("Account data:");
		System.out.println(account);
		
		System.out.println("Enter a deposit value: ");
		double deposit = sc.nextDouble();
		account.deposit(deposit);
		System.out.println("Updated account data: ");
		System.out.println(account);
		
		System.out.println("Enter a withdraw value: ");
		double withdraw = sc.nextDouble();
		account.withdraw(withdraw);
		System.out.println("Updated account value: ");
		System.out.println(account);	
		
		sc.close();
	
	}

}
