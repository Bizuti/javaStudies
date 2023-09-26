package pack1;

import java.util.Scanner;

public class ExerciseFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escolha um número e veja seus divisores!");
		int contagem = sc.nextInt();
		
		for (int i = 1; i != contagem ; i++) {
			
			if (contagem % i == 0) {
				System.out.println(i);
			}
		}
		
		
		

		
		sc.close();
}
}
