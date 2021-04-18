package pkg1;

import java.util.Scanner;

public class Rectangle {
	public double getArea(double width, double height) {
		return width * height;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please input width: ");
		double width = sc.nextDouble();
		System.out.println("please input height: ");
		double height = sc.nextDouble();
		sc.close();

		Rectangle rectangle = new Rectangle();
		System.out.println("rectangle area is " + rectangle.getArea(width, height));

	}
}
