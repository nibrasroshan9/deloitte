package jdbcexcercise;

import java.util.Scanner;

public class Product {
	private int productId;
	private String productName;
	private int qoh;
	private int price;
	
	public void accept() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Product ID");
		this.productId = in.nextInt();
		System.out.println("Enter Product Name");
		this.productName = in.next();
		System.out.println("Enter Product Price");
		this.price = in.nextInt();
		System.out.println("Enter Product Quantity");
		this.qoh = in.nextInt();
		in.close();
	}

	public Product(int productId, String productName, int qoh, int price) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.qoh = qoh;
		this.price = price;
	}
	
	public Product() {
		// TODO Auto-generated constructor stub
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getQoh() {
		return qoh;
	}

	public void setQoh(int qoh) {
		this.qoh = qoh;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", qoh=" + qoh + ", price=" + price
				+ "]";
	}


	public static void main(String[] args) {
		Product a = new Product(1011, "Mi Band 4", 46, 2500);
		Product b = new Product(3142, "Nintendo Switch", 8, 25000);
		Product c = new Product(8451, "Pixel 4", 12, 50000);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

	}

}
