package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.abstracts.Payer;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Payer> payers = new ArrayList<>();
		
		System.out.print("Enter the numbers od tax payers: ");
		int n = sc.nextInt();
		for (int i=1; i<=n; i++) {
			System.out.print("Individual or company (i/c): ");
			char ch = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			double anualIncome = sc.nextDouble();
			if (ch == 'i') {
				System.out.print("Health expenditures: ");
				double healthExpenditures = sc.nextDouble();
				payers.add(new Individual(name, anualIncome, healthExpenditures));
			} else {
				System.out.print("Number of employees: ");
				int numberEmployees = sc.nextInt();
				payers.add(new Company(name, anualIncome, numberEmployees));
			}
		}
		double sum = 0.0;
		System.out.println();
		System.out.println("TAXES PAID: ");
		for (Payer tp : payers) {
			double tax = tp.tax();
			System.out.println(tp.getName() + ": $ " + String.format("%.2f", tax));
			sum += tax;
		}
		System.out.println();
		System.out.println("Total taxes: $ " + String.format("%.2f", sum));

		sc.close();
	}
	
	
}
