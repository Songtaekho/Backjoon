import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int M = scan.nextInt();
		int N = scan.nextInt();
		int sum = 0;
		int min = 10000;

		for (int i = M; i <= N; i++) {
			int cnt = 0;

			for (int j = 1; j <= i; j++) {

				if (i % j == 0) {
					cnt++;
				}

			}
			if (cnt == 2) {
				sum += i;
				if (min > i) {
					min = i;
				}
			}
		}

		if (sum == 0) {
			System.out.println(-1);
		} else {
			System.out.println(sum);
			System.out.println(min);
		}

	}
}