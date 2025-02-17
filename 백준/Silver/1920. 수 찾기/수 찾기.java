

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		Map<Integer, Integer> map = new HashMap<>();
		int N = scan.nextInt();

		for (int i = 0; i < N; i++) {
			map.put(scan.nextInt(), 0);
		}

		int M = scan.nextInt();

		for (int i = 0; i < M; i++) {
			int a = scan.nextInt();
			if (map.containsKey(a)) {
				System.out.println(1);
			} else {
				System.out.println(0);
			}
		}

	}
}
