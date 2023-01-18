package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rooms;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
				
		System.out.print("How many rooms will be rented? ");
		n = sc.nextInt();
		Rooms[] rooms = new Rooms[10];
		for (int i=0; i<n; i++) {
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Email: ");
			String email = sc.next();
			System.out.print("Room: ");
			int room = sc.nextInt();
			rooms[room] = new Rooms(name, email);
		}
		
		System.out.println("Busy rooms: ");
		for (int i=0; i<9; i++) {
			if (rooms[i] != null) {
				System.out.println("Room: " + i + ", " + rooms[i].getName() + ", " + rooms[i].getEmail());
			} 
		}
				
		sc.close();
	
	}

}
