
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		while (true) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			int c = scan.nextInt();

			if (a == 0 && b == 0 && c == 0) {
				break;
			}

			if (a + b > c && a + c > b && b + c > a) {
				if (a == b && a == c && b == c) {
					System.out.println("Equilateral");
				} else if (a == b || a == c || b == c) {
					System.out.println("Isosceles");
				} else {
					System.out.println("Scalene");
				}
			} else {
				System.out.println("Invalid");
			}

		}
	}
}
