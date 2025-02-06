
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int max = 0;

		int low = 0;

		Scanner scan = new Scanner(System.in);

		int A = scan.nextInt();
		int B = scan.nextInt();

		if (A > B) {
			low = B;
		} else {
			low = A;
		}

		int a = 1;
		for (int i = 0; i < low; i++) {
			if (A % a == 0 && B % a == 0 && a > max) {
				max = a;
			}
			a++;
		}
		System.out.println(max);
		System.out.println((A / max) * (B / max) * max);
	}

}
