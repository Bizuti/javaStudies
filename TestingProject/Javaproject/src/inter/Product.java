package inter;

public class Product {
	public String name;
	public double price;
	public int quantity;
	public int add;
	public int remove;
	
	public int AddProduct() {
		return quantity = quantity + add;
	}
	
	public int RemoveProduct() {
		return quantity = quantity - remove;
	}
	
	public double FullValue() {
		return price * quantity;
	}
	
	public String toString() {
		return name;
	}
}
