package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Boj10845 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Queue<Integer> queue = new LinkedList<>();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		int last = 0;
		
//		push X: 정수 X를 큐에 넣는 연산이다.
//		pop: 큐에서 가장 앞에 있는 정수를 빼고, 그 수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
//		size: 큐에 들어있는 정수의 개수를 출력한다.
//		empty: 큐가 비어있으면 1, 아니면 0을 출력한다.
//		front: 큐의 가장 앞에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
//		back: 큐의 가장 뒤에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
		
		for (int i=0; i < num; i++) {
			st = new StringTokenizer(br.readLine());
			
			switch(st.nextToken()) {
				case "push":
					last = Integer.parseInt(st.nextToken());
					queue.add(last);
					break;
				case "pop":
					if(queue.isEmpty()) sb.append(-1).append("\n");
					else sb.append(queue.poll()).append("\n");
					break;
				case "size":
					sb.append(queue.size()).append("\n");
					break;
				case "empty":
					if(queue.isEmpty()) sb.append(1).append("\n");
					else sb.append(0).append("\n");
					break;
				case "front":
					if(queue.isEmpty()) sb.append(-1).append("\n");
					else sb.append(queue.peek()).append("\n");
					break;
				case "back":
					if(queue.isEmpty()) sb.append(-1).append("\n");
					else sb.append(last).append("\n");
					break;
			}
		}
		
		System.out.println(sb);
		br.close();
	}

}
