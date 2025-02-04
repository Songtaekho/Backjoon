import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int X = scan.nextInt();

		int cnt = 0;

		for (int i = 1; i <= X + i; i++) {

			if (i > X) {

				break;
			}

			X -= i;
			cnt++;

		}

		if (X != 0) {
			cnt++;
		}

		if (cnt % 2 == 0) {
			int a = cnt + 1;
			if (X == 0) {
				System.out.println(a - 1 + "/" + 1);
			} else {
				System.out.println(a - (a - X) + "/" + (a - X));
			}

		}

		if (cnt % 2 != 0) {
			int a = cnt + 1;
			if (X != 0) {
				System.out.println(a - X + "/" + X);
			} else {
				System.out.println(1 + "/" + (a - 1));
			}
		}

	}
}