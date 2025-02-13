

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

		// K 받고 배열 마지막자리부터 나눔 (몫 * 나눈값) K에서 빼줌 그다음 N-1해서 다시 반복 K= 0이되면 종료

		int cnt = 0;

		for (int i = arr.length - 1; i >= 0; i--) {
			if (K >= arr[i]) {
				cnt += K / arr[i];
				K -= arr[i] * (K / arr[i]);
			}

			if (K == 0) {
				System.out.println(cnt);
				break;
			}

		}

	}
}
