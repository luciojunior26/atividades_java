package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double soma = 0;
		double media; 
		
		System.out.print("Quantos numeros voce vai digitar: ");
		int n = sc.nextInt();
		double[] vet = new double[n];
		
		for (int i=0; i<n; i++) {
			System.out.print("Digite um numero: ");
			vet[i] = sc.nextDouble();
		}
		System.out.print("Valores: ");
		for (int i=0; i<n; i++) {
			System.out.print(vet[i] + " ");
			soma = soma + vet[i];
		}
		media = soma / n;
		System.out.println();
		System.out.println("Soma = " + soma);
		System.out.println("Media = " + media);
		
	}

}
