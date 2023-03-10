package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {

		Student student = new Student();
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Aluno: ");
		student.name = sc.nextLine();
		System.out.print("Nota 1: ");
		student.n1 = sc.nextDouble();
		System.out.print("Nota 2: ");
		student.n2 = sc.nextDouble();
		System.out.print("Nota 3: ");
		student.n3 = sc.nextDouble();

		System.out.printf("Final Grade: " + "%.2f\n", student.finalGrade());
		student.isAproved();

		sc.close();
	}

}
