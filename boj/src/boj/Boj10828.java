package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class Boj10828 {
	public static void main(String[] args) throws NumberFormatException, IOException {
//		push X: 정수 X를 스택에 넣는 연산이다.
//		pop: 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
//		size: 스택에 들어있는 정수의 개수를 출력한다.
//		empty: 스택이 비어있으면 1, 아니면 0을 출력한다.
//		top: 스택의 가장 위에 있는 정수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
		
		Stack<Integer> stack = new Stack<>();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		
		int num = Integer.parseInt(br.readLine());
		
		for (int i =0; i<num; i++) {
			st = new StringTokenizer(br.readLine());
			String command = st.nextToken();
			
			switch(command) {
				case "push":
					stack.add(Integer.parseInt(st.nextToken()));
					break;
				case "pop":
					if (stack.isEmpty()) sb.append(-1).append("\n");
					else sb.append(stack.pop()).append("\n");
					break;
				case "size":
					sb.append(stack.size()).append("\n");
					break;
				case "empty":
					if (stack.isEmpty()) sb.append(1).append("\n");
					else sb.append(0).append("\n");
					break;
				case "top":
					if (stack.isEmpty()) sb.append(-1).append("\n");
					else sb.append(stack.peek()).append("\n");
					break;
			}
			
		}
		br.close();
		System.out.println(sb.toString());
		
	}
}
