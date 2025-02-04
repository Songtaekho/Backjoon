import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int y = scan.nextInt();
		int w = scan.nextInt();
		int h = scan.nextInt();

		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;

		int min = 1000;

		a = x - 0;
		b = w - x;

		c = y - 0;
		d = h - y;

		if (min > a) {
			min = a;
		}
		if (min > b) {
			min = b;
		}
		if (min > c) {
			min = c;
		}
		if (min > d) {
			min = d;
		}

		System.out.println(min);
	}
}