package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj10797 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int today = Integer.parseInt(br.readLine());
		int count = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());

		for (int i = 0; i < 5; i++) {
			if (today == (Integer.parseInt(st.nextToken()))) {
				count++;
			}
		}
		System.out.println(count);
		br.close();
	}

}
