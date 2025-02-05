

import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		Stack<Integer> stack = new Stack<>();

		int N = scan.nextInt();

		for (int i = 0; i < N; i++) {
			String str = scan.next();

			if (str.equals("push")) {
				stack.push(scan.nextInt());
			}

			if (str.equals("pop") && stack.size() > 0) {
				System.out.println(stack.pop());
			} else if (str.equals("pop") && stack.size() < 1) {
				System.out.println(-1);
			}

			if (str.equals("size")) {
				System.out.println(stack.size());
			}

			if (str.equals("empty") && stack.size() > 0) {
				System.out.println(0);
			} else if (str.equals("empty") && stack.size() < 1) {
				System.out.println(1);
			}

			if (str.equals("top") && stack.size() > 0) {
				System.out.println(stack.peek());
			} else if (str.equals("top") && stack.size() < 1) {
				System.out.println(-1);
			}

		}

	}
}
