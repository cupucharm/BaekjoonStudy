package boj;

import java.util.Scanner;

public class Boj2440 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = n;

		for (int i = 0; i < n; i++) {
			for (int j = m; j > 0; j--) {
				System.out.print("*");
			}
			m -= 1;
			System.out.println();
		}
		scanner.close();
	}
}
