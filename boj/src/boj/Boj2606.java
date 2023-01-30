package boj;

import java.util.ArrayList;
import java.util.Scanner;

public class Boj2606 {
	public static ArrayList<Integer>[] node;
	public static boolean[] visited;
	public static int count = 0;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		node = new ArrayList[n+1];
		visited = new boolean[n+1]; 
		
		int arcs = scanner.nextInt();
		int x = 0, y = 0;
		
		for (int i=1; i<=n;i++) {
			node[i] = new ArrayList<>();
		}
		
		for (int i=1; i<=arcs; i++) {
			x = scanner.nextInt();
			y = scanner.nextInt();
			
			node[x].add(y);
			node[y].add(x);
		}
		
		dfs(1, node, visited);
		System.out.println(count-1);
		
		scanner.close();
	}

	private static void dfs(int start, ArrayList<Integer>[] node, boolean[] visited) {
		if(visited[start] == true) return;
		
		visited[start] = true;
		count++;
		
		for (int i=0; i<node[start].size(); i++) {
			dfs(node[start].get(i), node, visited);
		}
		
	}
}
