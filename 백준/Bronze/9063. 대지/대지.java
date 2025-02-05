import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();

		int maxx = -10000;
		int minx = 10000;

		int maxy = -10000;
		int miny = 10000;

		if (N <= 1) {
			System.out.println(0);
			return;
		}

		for (int i = 0; i < N; i++) {
			int x = scan.nextInt();
			int y = scan.nextInt();

			if (maxx < x) {
				maxx = x;
			}
			if (minx > x) {
				minx = x;
			}
			if (maxy < y) {
				maxy = y;
			}
			if (miny > y) {
				miny = y;
			}

		}

//		System.out.println("x최대값"+maxx);
//		
//		System.out.println("x최소값"+minx);
//		
//		System.out.println("y최대값"+maxy);
//		
//		System.out.println("y최소값"+miny);

		System.out.println((maxx - minx) * (maxy - miny));

	}
}
