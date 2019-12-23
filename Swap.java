package demo;

import java.util.Scanner;

public class Swap {
	public void swapper() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter first number");
		int a = in.nextInt();
		System.out.println("Enter second number");
		int b = in.nextInt();
		b = (a+b);
		a = (b-a);
		b = (b-a);
		System.out.println("First value is now "+ a);
		System.out.println("Second value is now"+ b);		
	}
	public static void main(String[] args) {
		Swap s = new Swap();
		s.swapper();
	}

}
