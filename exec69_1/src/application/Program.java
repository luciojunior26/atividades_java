package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangle rectangle = new Rectangle();
		
		System.out.print("Altura Retangulo: ");
		rectangle.height = sc.nextDouble();
		System.out.print("Largura Retangulo: ");
		rectangle.width = sc.nextDouble();
	
		System.out.println(rectangle.toString());
		sc.close();
		
	}

}
