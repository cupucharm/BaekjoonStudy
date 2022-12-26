package boj;

import java.util.Scanner;

public class Boj25314 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
		int x = scanner.nextInt();
		
		for (int i =0; i<x/4; i++) {
			System.out.print("long ");
		}
		System.out.println("int");
		scanner.close();
	}
}
