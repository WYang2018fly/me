package pkg1;

import java.util.Scanner;

public class GuessDemo {
	public static void main(String[] args) {
		int number = (int)(Math.random() * 10 + 1);
		int guess;
		System.out.println("guess 1~10 number");
		do {
			System.out.println("please input your guess number：");
			Scanner sc = new Scanner(System.in);
			guess = sc.nextInt();
			if (guess > number) {
				System.out.println("bigger!");
			} else if (guess < number) {
				System.out.println("smaller!");
			}
		} while (number != guess);
		System.out.println("bingo! number is " + number);
	}
}
