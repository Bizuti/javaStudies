package pack1;

import java.util.Scanner;

public class Apploop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quer contar até quanto?");
		int contagem = sc.nextInt(); 
		
		for (int i= 0 ; i <= contagem; i++) {
			System.out.println(i);
		}
		
		
		sc.close();
	}

}
