

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int T = scan.nextInt();

		int[][] arr = new int[15][15];

		for (int i = 0; i < 15; i++) { // 0층 1~14호까지 1~14명 채우고 0층부터 14층까지 1호실에는 1명씩 채움
			arr[i][1] = 1;
			arr[0][i] = i;
		}

		for (int i = 0; i < T; i++) {
			int k = scan.nextInt();
			int n = scan.nextInt();

			for (int j = 2; j <= n; j++) { // 2호부터 n 번방까지 반복
				for (int m = 1; m <= k; m++) { // 1층부터 k번 층까지 반복
					arr[m][j] = arr[m - 1][j] + arr[m][j - 1]; // 구해야할 방은 자기 왼쪽방 수 + 본인 아래층 수
				}

			}

			System.out.println(arr[k][n]);

		}

	}
}
