

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int M = scan.nextInt();
		int N = scan.nextInt();

		int[] arr = new int[N + 1];

		// 2부터 시작하여 소수 판별
		for (int i = 2; i <= N; i++) {

			if (arr[i] == 0) { // (소수)
				// i가 소수라면 배수들을 삭제
				for (int j = i * 2; j <= N; j += i) {
					arr[j] = 1; // i의 배수는 소수가 아님
				}
			}
		}

		// 소수만 출력
		for (int i = M; i <= N; i++) {
			if (arr[i] == 0 && i != 1) { // 0이면 소수
				System.out.println(i);
			}
		}

	}
}
