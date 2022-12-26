package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj2530 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String time = br.readLine();
		
		StringTokenizer st = new StringTokenizer(time);
		int h = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int s = Integer.parseInt(st.nextToken());
		
		int second = Integer.parseInt(br.readLine());
		
		h += second / 3600;
		m += (second - (second / 3600) * 3600) / 60;
		s += second % 60;
		
		if (s >= 60) {
			int n = s/60;
			
			s -= 60*n;
			m += 1*n;
		}
		
		if (m >= 60) {
			int n = m/60;
			m -= 60*n;
			h += 1*n;
		}
		
		if (h >= 24) {
			int n = h/24;
			h-=24*n;
		}
		
		System.out.println(h + " " + m + " " + s);
		
		br.close();
	}
}
