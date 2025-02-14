

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();

		int cnt = 0;

		int i = 666;

		while (true) {

			boolean result = String.valueOf(i).contains("666");

			if (result == true) {
				cnt++;
			}

			if (cnt == N) {
				System.out.println(i);
				break;
			}

			i++;

		}

	}
}
