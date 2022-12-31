package application;

import java.util.Locale;
import java.util.Scanner;

import entities.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is the dollar price?");
		double quotes = sc.nextDouble();
		System.out.println("How many dollars will be bought?");
		double buy = sc.nextDouble();
		
		double pay = quotes * buy;
		System.out.println(CurrencyConverter.converter(pay));
		

	}

}
