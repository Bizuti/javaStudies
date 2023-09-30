package application;
import java.util.Scanner;
import inter.Rectangle;
public class RectangleMeasure {

	public static void main(String[] args) {
		
		String repeat = "s";
		Scanner sc = new Scanner(System.in);
		Rectangle x = new Rectangle();
		
		while (repeat == "s") {
		System.out.println("Enter the width of the rectangle: ");
		x.width = sc.nextDouble();
		System.out.println("Enter the height of the rectangle: ");
		x.height = sc.nextDouble();
		
		System.out.println("Area: " + x.Area());
		System.out.println("Perimeter: " + x.Perimeter());
		
		System.out.println("Repeat? (s/n)");
		repeat = sc.next();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();
	}	

}
