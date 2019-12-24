
public class Calculator {
	public void add(int a, int b) {
		System.out.println(a+b);
	}
	public void add(double a, double b) {
		System.out.println(a+b);
	}
	public void add(int a, double b) {
		double s = (double)a;
		System.out.println(s+b);
	}
	public void add(double a, int b) {
		double s = (double)b;
		System.out.println(a+s);
		
	}
	public void diff(int a, int b) {
		System.out.println(a-b);
	}
	public void diff(double a, double b) {
		System.out.println(a-b);
	}
	public void diff(int a, double b) {
		double s = (double) a;
		System.out.println(s-b);
	}
	public void diff(double a, int b) {
		double s= (double )b;
		System.out.println(a-s);
	}
	
	public void mul(int a, int b) {
		System.out.println(a*b);
	}
	public void mul(double a, double b) {
		System.out.println(a*b);
	}
	public void mul(int a, double b) {
		double s = (double )a;
		System.out.println(s*b);
	}
	public void mul(double a, int b) {
		double s= (double )b;
		System.out.println(a*s);
	}
	
	public void div(int a, int b) {
		System.out.println(a/b);
	}
	public void div(double a, double b) {
		System.out.println(a/b);
	}
	public void div(int a, double b) {
		double s = (double )a;
		System.out.println(s/b);
	}
	public void div(double a, int b) {
		double s = (double )b;
		System.out.println(a/s);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a = 1.1;
		double b = 2.2;
		int x = 5;
		int y = 6;
		Calculator c = new Calculator();
		c.mul(a, b);
		c.mul(a, x);
		c.mul(x, y);
		c.add(a, x);
		
	}

}
