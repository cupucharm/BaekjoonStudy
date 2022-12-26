package boj;

import java.util.Scanner;

public class Boj25372 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = Integer.parseInt(scanner.nextLine());
		String str = null;
		for (int i = 0; i < n; i++) {
			str = scanner.nextLine();
			if(str.length() >=6 && str.length() <=9) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}
		}
		scanner.close();
	}
}
