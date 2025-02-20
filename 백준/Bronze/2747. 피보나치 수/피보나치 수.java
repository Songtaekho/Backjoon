import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		System.out.println(fibonacci(n));

	}

	public static int fibonacci(int n) {

		if (n <= 1) {
			return n;
		}

		int a = 0; // F[0] 은 0
		int b = 1; // F[1] 은 1부터 시작
		int c = 0; // F[2]도 1부터 시작 서로 더해주면서 값 넘겨줄꺼임
		for (int i = 2; i <= n; i++) {
			c = a + b;
			a = b;
			b = c;

		}
		return b; // b값이 마지막 피보나치값 c로 줘도 똑같음
	}

}
