
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();

		for (int i = 0; i < N; i++) {
			int cnt = 0;
			int sum = 0;

			String str = scan.next();

			char[] arr = new char[str.length()];

			for (int j = 0; j < str.length(); j++) {
				arr[j] = str.charAt(j);

			}

			for (int j = 0; j < arr.length; j++) {
				if (arr[j] == 'O') {
					cnt++;
					sum += cnt;
				} else if (arr[j] == 'X') {
					cnt = 0;
				}

			}

			System.out.println(sum);
		}
	}

}
