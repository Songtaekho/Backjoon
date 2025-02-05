

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		Deque<Integer> queue = new ArrayDeque<>();

		int n = scan.nextInt();

		for (int i = 0; i < n; i++) {
			String str = scan.next();

			if (str.equals("push")) {
				queue.offer(scan.nextInt());
			}

			if (str.equals("front") && queue.size() > 0) {
				System.out.println(queue.peek());
			} else if (str.equals("front") && queue.size() < 1) {
				System.out.println(-1);

			}
			if (str.equals("back") && queue.size() > 0) {
				System.out.println(queue.peekLast());
			} else if (str.equals("back") && queue.size() < 1) {
				System.out.println(-1);
			}

			if (str.equals("size")) {
				System.out.println(queue.size());
			}

			if (str.equals("pop") && queue.size() > 0) {
				System.out.println(queue.poll());
			} else if (str.equals("pop") && queue.size() < 1) {
				System.out.println(-1);
			}

			if (str.equals("empty")) {
				if (queue.size() > 0) {
					System.out.println(0);
				} else {
					System.out.println(1);
				}
			}
		}

	}

}
