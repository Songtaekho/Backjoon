

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int T = scan.nextInt();

		for (int i = 0; i < T; i++) {
			int W = scan.nextInt();
			int H = scan.nextInt();
			int N = scan.nextInt();
			int[][] arr = new int[W][H];
			int cnt = 0;
			for (int j = 0; j < H; j++) {

				for (int k = 0; k < W; k++) {
					arr[k][j] = ((k + 1) * 100 + j + 1);
					cnt++;
					if (cnt == N) {
						System.out.println(arr[k][j]);
					}
				}

			}

		}

	}
}
