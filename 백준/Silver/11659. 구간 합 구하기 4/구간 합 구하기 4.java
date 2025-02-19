

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();
		int M = scan.nextInt();

		int[] arr = new int[N + 1];

		for (int i = 1; i < arr.length; i++) {
			arr[i] = arr[i - 1] + scan.nextInt();
		}

		for (int i = 0; i < M; i++) {

			int a = scan.nextInt();
			int b = scan.nextInt();

			System.out.println(arr[b] - arr[a - 1]);
		}

	}

}
