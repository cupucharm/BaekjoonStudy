package boj;

import java.util.Scanner;

public class Boj2445 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		for (int i = 1; i < n; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			for (int j = n; j-i > 0; j--) {
				System.out.print(" ");
			}
			for (int j = n; j-i > 0; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}

		for (int i = n; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			for (int j = n; j-i > 0; j--) {
				System.out.print(" ");
			}
			for (int j = n; j-i > 0; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}

		scanner.close();
	}

}
