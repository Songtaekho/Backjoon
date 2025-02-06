
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		while (true) {
			int A = scan.nextInt();
			int B = scan.nextInt();
			int C = scan.nextInt();

			if (A == 0 && B == 0 && C == 0) {
				break;
			}
			if (A * A == B * B + C * C || B * B == A * A + C * C || C * C == B * B + A * A) {
				System.out.println("right");
			} else {
				System.out.println("wrong");
			}

		}

	}
}
