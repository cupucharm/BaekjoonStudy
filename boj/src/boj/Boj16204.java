package boj;

import java.util.Scanner;

public class Boj16204 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int k = scanner.nextInt();

		if (m - k > 0) {
			System.out.println(k + n - m);
		} else if (m - k < 0) {
			System.out.println(m + n - k);
		} else if (m - k == 0) {
			System.out.println(n);
		}
		scanner.close();
	}
}
