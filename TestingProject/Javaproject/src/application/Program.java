package application;
import java.util.Scanner;
import inter.Triangle;
public class Program {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Triangle y = new Triangle();
		Triangle x = new Triangle();
		
		System.out.println("Enter the measures of triangle x: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("Enter the measures of triangle y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double areaX = x.area();
		double areaY = y.area();
		
		System.out.printf("Triangle X area: %.4f%n", areaX);
		System.out.printf("Triangle Y area: %.4f%n", areaY);
		
		if (areaX > areaY) {
			System.out.println("Area X is bigger than area Y");
		} else if(areaX == areaY) {
			System.out.println("Have the same measure");
		} else {
			System.out.println("Area Y is bigger than area X");
		}
		
		
		
		
		
		
		sc.close();
	}
}
