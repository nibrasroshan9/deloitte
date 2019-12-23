package demo;

import java.util.Scanner;

public class Leap {
	public void isLeap() {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter year");
		int y = ip.nextInt();
		if(y%4 == 0)
			System.out.println(y+" is a leap year");
		else
			System.out.println(y+" is not a leap year");
		ip.close();
	}
	public static void main(String[] args) {
		Leap l = new Leap();
		l.isLeap();
	}

}
