

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();
		int M = scan.nextInt();

		int[] arr = new int[N];

		for (int i = 0; i < N; i++) {
			arr[i] = scan.nextInt();
		}

		int max = 0;
		for (int i = 0; i < arr.length - 2; i++) {
			for (int j = i+1; j < arr.length - 1; j++) {
				for (int k = j+1; k < arr.length; k++) {
					if (max <= arr[i] + arr[j] + arr[k] && arr[i] + arr[j] + arr[k] <= M) {
						max = arr[i] + arr[j] + arr[k];
					}

				}
			}
		}
		System.out.println(max);
	}

}
