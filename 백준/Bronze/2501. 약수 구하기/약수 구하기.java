import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();
		int K = scan.nextInt();
		int cnt = 0;
		int a = 0;

		for (int i = 1; i <= N; i++) {
			if (N % i == 0) {
				a = i;
				cnt++;
			}
			if (cnt == K) {
				System.out.println(a);
				break;
			}
		}
		if (cnt < K) {
			System.out.println(0);
		}

	}
}