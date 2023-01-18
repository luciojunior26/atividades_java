package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Person;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, nmenores;
		double alturatotal, alturamedia, percMenores;
		
		System.out.print("Quantas pessoas serao digitadas? ");
		n = sc.nextInt();
		Person[] persons = new Person[n];

		for (int i=0; i<n;  i++) {
			System.out.println("Dados da " + (i+1) + "a pessoa: ");
			System.out.println();
			System.out.println("Nome: ");
			String nome = sc.next();
			System.out.println("Idade: ");
			int idade = sc.nextInt();
			System.out.println("Altura: ");
			double altura = sc.nextDouble();
			persons[i] = new Person(nome,idade,altura);
		}
/*		String[] nomes = new String[n];
		int[] idades = new int[n];
		double[] alturas = new double[n];
		
		for (int i=0; i<n; i++) {
			System.out.print("Dados de " + (i+1) + "a pessoa: ");
			System.out.println();
			System.out.print("Nome: ");
			nomes[i] = sc.next();
			System.out.print("Idade: ");
			idades[i] = sc.nextInt();
			System.out.print("Altura: ");
			alturas[i] = sc.nextDouble();
		} */
		nmenores = 0;
		alturatotal = 0;
		
		for (int i=0; i<n; i++) {
			if (persons[i].getIdade() < 16) {
				nmenores++;
			}
			alturatotal += persons[i].getAltura();
		}
		
		alturamedia = alturatotal / n;
		percMenores = ((double)nmenores / n) * 100;
		
		System.out.printf("\nAltura media = %.2f\n", alturamedia);
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", percMenores);

		for(int i=0; i<n; i++) {
			if (persons[i].getIdade() < 16) {
		        	System.out.printf("%s\n", persons[i].getNome());
		    }
	    }

		sc.close();
			
	}

}
