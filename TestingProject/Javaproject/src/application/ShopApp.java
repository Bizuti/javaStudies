package application;
import inter.Product;
import java.util.Scanner;
public class ShopApp {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Product product= new Product();
		
		
		
		
		System.out.println("Enter product data:");
		System.out.println("Name:");
		product.name = sc.next();
		System.out.println("Price:");
		product.price = sc.nextDouble();
		System.out.println("Quantity:");
		product.quantity = sc.nextInt();
		double value = product.FullValue();
		
		product.toString();
		
		System.out.println("Data: "+ product.name+ ", $"+ product.price + ", " + product.quantity + " units, total: $" + value);
		
		
	
		System.out.println(product);
		product.add = sc.nextInt();
		
		System.out.println("Updated Data: "+ product.name+ ", $"+ product.price + ", " + product.AddProduct() + " units, total: $" + product.FullValue());
		
		
		System.out.println("Enter the number of products to be removed: ");
		
		product.remove = sc.nextInt();
		
		
		System.out.println("Updated Data: "+ product.name+ ", $"+ product.price + ", " + product.RemoveProduct() + " units, total: $" + product.FullValue());
		
		sc.close();
	}

}
