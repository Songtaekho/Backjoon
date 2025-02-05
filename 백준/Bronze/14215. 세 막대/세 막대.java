
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();

		if (a + b > c && a + c > b && b + c > a) {
			System.out.println(a + b + c);
		} else {
			if (a + b <= c) {
				System.out.println((a + b) * 2 - 1);
			}
			if (a + c <= b) {
				System.out.println((a + c) * 2 - 1);
			}
			if (c + b <= a) {
				System.out.println((c + b) * 2 - 1);
			}
		}
	}
}
