package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
				
		Employee employee = new Employee();
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Name: ");
		employee.name = sc.nextLine();
		System.out.print("Gross Salary: ");
		employee.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		employee.tax = sc.nextDouble();
		
		System.out.printf("Employee: " + employee.name + ", $ " + "%.2f\n", employee.netSalary());
		
		System.out.print("Which percentage to increase salary: " );
		double percentage = sc.nextDouble();
		
		employee.increaseSalary(percentage);
		
		System.out.printf("Updated data: " + employee.name + ", $ " + "%.2f\n", employee.netSalary());
				
		sc.close();		
	}

}
