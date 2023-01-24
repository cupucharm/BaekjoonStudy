package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj24479 {
	
	public static int count = 0;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int[][] node = new int[n+1][n+1];
		boolean[] checked = new boolean[n];
		
		int arcs = Integer.parseInt(st.nextToken());
		int start = Integer.parseInt(st.nextToken());
		
		int x, y;
		
		for(int i=1; i<arcs+1; i++) {
			st = new StringTokenizer(br.readLine());
			x = Integer.parseInt(st.nextToken());
			y = Integer.parseInt(st.nextToken());
			node[x][y] = 1;
			node[y][x] = 1;
		}
		
		dfs(start, node, checked);
		for (int i =0; i < arcs-count; i++) {
			System.out.println("0");
		}
		
		br.close();
	}

	private static void print(int start) {
		System.out.println(start);
		count++;
	}

	private static void dfs(int start, int[][] node, boolean[] checked) {
		checked[start] = true;
		print(start);
		
		for(int i=0; i<node[start].length; i++) {
			if(node[start][i] == 1) {
				if(checked[i] == true) continue;
				dfs(i, node, checked);
			}
		}
	}

}
