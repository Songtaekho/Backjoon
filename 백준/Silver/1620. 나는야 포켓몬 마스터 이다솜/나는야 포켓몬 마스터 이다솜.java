

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Map<Integer, String> map = new HashMap<>();
		Map<String, Integer> map2 = new HashMap<>();

		int N = scan.nextInt();
		int M = scan.nextInt();

		for (int i = 1; i <= N; i++) {
			String poke = scan.next();
			map.put(i, poke);
			map2.put(poke, i);
		}

		for (int i = 0; i < M; i++) {
			String str = scan.next();
			if (map2.containsKey(str)) {
				System.out.println(map2.get(str));
			} else {
				System.out.println(map.get(Integer.parseInt(str)));
			}
		}

	}
}
