package pack1;

import java.util.Locale;
import java.util.Scanner;

public class test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		

		double x = sc.nextDouble();
		int y = sc.nextInt();
		String z = sc.next();
		System.out.printf("Você digitou: %.2f, %d e %s %n", x , y , z);
		
		
		
		
		sc.close();
	}

}
