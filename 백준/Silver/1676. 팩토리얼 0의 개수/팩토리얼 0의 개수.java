

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();

		// 2와 5의 짝이 맞을때마다 뒤에 0의 자리 수가 늘어남
		// 2의 개수는 5보다 무조건 많기때문에 5의 개수만 구하면됨

		int cnt = 0;

		// 5의 배수부터 시작해서 5, 25, 125까지 체크
		// 5의 제곱수는 5가 여러번 나온거여서 다시 체크 헤줘야함
		for (int i = 5; i <= N; i *= 5) {
			cnt += N / i; // N을 i로 나눈 몫이 그 배수의 개수
		}

		System.out.println(cnt);

	}
}
