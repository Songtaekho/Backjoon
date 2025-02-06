

import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		Stack<Integer> stack = new Stack<>();

		int N = scan.nextInt();

		for (int i = 0; i < N; i++) {
			int K = scan.nextInt();
			if (K == 0) {
				stack.pop();
			} else {
				stack.push(K);
			}
		}

		int sum = 0;
		while (stack.isEmpty() == false) {
			sum += stack.pop();
		}
		System.out.println(sum);

	}

}
