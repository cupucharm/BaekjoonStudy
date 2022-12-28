package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj2845 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int x = 0;
		
		st = new StringTokenizer(br.readLine());
		
		for (int i =0; i<5; i++) {
			x = Integer.parseInt(st.nextToken());
			
			sb.append(x - a*b + " ");
		}
		
		System.out.print(sb);
		br.close();
	}
}
