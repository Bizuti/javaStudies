package Teste;

import java.util.Scanner;

public class Raio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual o valor do raio do círculo: ");
		double R = sc.nextDouble();
		
		double area = 3.14159 * java.lang.Math.pow(R, 2);
		System.out.println("A área do Círculo é: ");
		System.out.printf("%.2f %n", area);
		
		
		
		
		sc.close();
	}

}
