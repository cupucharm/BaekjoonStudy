package boj;

import java.util.Scanner;

public class Boj5543 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int bprice = 100;
		int jprice =100;
		
		int burger = 2000;
		int juice = 2000;
		
		for (int i =0; i<3; i++) {
			bprice = scanner.nextInt();
			
			if (burger > bprice) {
				burger = bprice;
			}
		}
		
		for (int i =0; i<2; i++) {
			jprice = scanner.nextInt();
			
			if (juice > jprice) {
				juice = jprice;
			}
		}
		
		System.out.println(burger + juice - 50);
		scanner.close();
	}

}
