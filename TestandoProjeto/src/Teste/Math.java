package Teste;

import java.util.Scanner;

public class Math {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		double n1, n2, n3, A, B, C;
		n1 = sc.nextDouble();
		n2 = sc.nextDouble();
		n3 = sc.nextDouble();
		
		A = java.lang.Math.sqrt(n1);
		B = java.lang.Math.sqrt(n2);
		C = java.lang.Math.sqrt(n3);
		System.out.printf("A raíz quadrada de %.2f é %.2f %n", n1, A);
		System.out.printf("A raíz quadrada de %.2f é %.2f %n", n2, B);
		System.out.printf("A raíz quadrada de %.2f é %.2f %n",n3, C );
		
		
		
		
		
		
		sc.close();
	}

}
