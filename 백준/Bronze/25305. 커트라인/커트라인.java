

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();
		int K = scan.nextInt();

		int[] arr = new int[N];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}

		Arrays.sort(arr);

		System.out.println(arr[N - K]);

	}
}
