package boj;

import java.util.Scanner;
import java.util.Stack;

public class Boj9012 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Stack<Character> stack = new Stack<>();

		int n = Integer.parseInt(scanner.nextLine());
		String str = null;
		String printstr = "YES";

		for (int i = 0; i < n; i++) {
			str = scanner.next();

			for (int j = 0; j < str.length(); j++) {
				char ch = str.charAt(j);
				if (ch == ')') {
					if (stack.isEmpty()) {
						printstr = "NO";
					} else {
						stack.pop();
					}
				} else {
					stack.add(ch);
				}
			}
			if (!stack.isEmpty()) {
				printstr = "NO";
			}
			
			System.out.println(printstr);

			stack.clear();
			printstr = "YES";
		}
		scanner.close();
	}
}
