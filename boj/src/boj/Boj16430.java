package boj;

import java.util.Scanner;

public class Boj16430 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		
		System.out.println((y-x) + " " + y);
		scanner.close();
	}
}