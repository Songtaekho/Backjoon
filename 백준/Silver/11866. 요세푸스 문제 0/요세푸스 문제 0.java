

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		Queue<Integer> queue = new LinkedList<>();
		Queue<Integer> queue2 = new LinkedList<>();

		int N = scan.nextInt();
		int K = scan.nextInt();

		for (int i = 1; i <= N; i++) {
			queue.offer(i);
		}

		for (int i = queue.size(); i > 0; i--) {
			for (int j = 1; j <= K; j++) {
				if (j < K) {
					int a = queue.poll();
					queue.offer(a);
				} else if (j == K) {
					queue2.offer(queue.poll());
				}

			}
		}
		int size = queue2.size();

		System.out.print("<");
		for (int i = 0; i < size; i++) {
			if (i + 1 < size) {
				System.out.print(queue2.poll() + ", ");
			} else if (i + 1 == size) {
				System.out.print(queue2.poll());
			}
		}
		System.out.println(">");

	}

}
