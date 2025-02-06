

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		while (true) {
			int N = scan.nextInt();
			if (N == 0) {
				break;
			}

			String word = Integer.toString(N);
			String str = "";
			for (int i = word.length() - 1; i >= 0; i--) {
				str += word.charAt(i);
			}
			if (word.equals(str)) {
				System.out.println("yes");

			} else {
				System.out.println("no");
			}

		}
	}

}
