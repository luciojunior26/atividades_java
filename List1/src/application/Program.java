package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employees;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List <Employees> list = new ArrayList<>();
				
		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();
		
		for (int i=0; i<n; i++) {
			
			System.out.println();
			System.out.println("Employee #" +(i+1) + ":");
			System.out.print("ID: ");
			Integer id = sc.nextInt();
			while (hasID(list, id)) {
				System.out.print("Id already taken. Try again: ");
				id = sc.nextInt();
			}
			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();
			
			Employees emp = new Employees(id, name, salary);
			list.add(emp);
		}
		
		System.out.print("Enter the employee id that will have salary increase: "); 
		int id = sc.nextInt();
		Employees emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if (emp == null) {
			System.out.println("This id does not exist!");
		}
		else {
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			emp.icreaseSalary(percentage);
		}
		
		System.out.println();
		System.out.println("List of employees:");
		for (Employees obj : list) {
			System.out.println(obj);
		}
		
		sc.close();
	}
	
	public static boolean hasID(List<Employees> list, int id) {
		Employees emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}
}
