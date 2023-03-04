package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int l = 0;
		int c = 0;
				
		System.out.print("Line: ");
		l = sc.nextInt();
		System.out.print("Column: ");
		c = sc.nextInt();
		
		int[][] mat = new int[l][c];
		
		for (int i=0; i<l; i++) {
			for (int j=0; j<c; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.print("Number: ");
		int nun = sc.nextInt();
		
		for (int i=0; i<l; i++) {
			for (int j=0; j<c; j++) {
				if (nun == mat[i][j]) {
					System.out.println("Position: " + i + ","+ j + ":");
					if (i != 0) {
						System.out.println("UP: " + mat[i-1][j]);
					} 
					if (i != l-1) {
						System.out.println("Down: " + mat[i+1][j]);
					}
					if (j != 0) {
						System.out.println("Left: " + mat[i][j-1]);
					}
					if (j != c-1) {
						System.out.println("Right: " + mat[i][j+1]);					
					}
				}
			}
		}
		
		sc.close();
		

	}

}
