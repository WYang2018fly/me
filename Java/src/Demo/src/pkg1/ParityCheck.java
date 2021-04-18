package pkg1;

import java.util.Scanner;

public class ParityCheck{
	public static void main(String[] args) {
		System.out.println("input a integer number: ");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		System.out.println(n % 2 == 0 ? "even number" : "odd number" ); 	
	}
}
