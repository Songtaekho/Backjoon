

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int d = scan.nextInt();
		int e = scan.nextInt();
		int f = scan.nextInt();

		int x = ((e * c) - (b * f)) / ((a * e) - (b * d));
		int y = ((a * f) - (d * c)) / ((a * e) - (b * d));

		System.out.println(x + " " + y);

	}

}
