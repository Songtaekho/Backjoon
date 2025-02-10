
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		long sum = 0;
		long j = 0;

		for (int i = 1; i <= n - 2; i++) {
			j += i;
			sum += j;

		}

		System.out.println(sum);
		System.out.println(3);

	}

}
