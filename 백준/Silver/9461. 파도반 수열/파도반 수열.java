

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int T = scan.nextInt();

		long[] arr = new long[100];
		arr[0] = 1;
		arr[1] = 1;
		arr[2] = 1;
		arr[3] = 2;
		arr[4] = 2;
		arr[5] = 3;
		arr[6] = 4;
		arr[7] = 5;
		arr[8] = 7;
		arr[9] = 9;

		for (int i = 10; i < 100; i++) {
			arr[i] = arr[i - 3] + arr[i - 2];
		}

		for (int i = 0; i < T; i++) {
			int P = scan.nextInt();

			System.out.println(arr[P - 1]);
		}

	}
}
