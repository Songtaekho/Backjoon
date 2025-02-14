

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();

		String str = Integer.toString(N);

		char[] arr = new char[str.length()];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = str.charAt(i);
		}

		Arrays.sort(arr);

		String str2 = "";

		for (int i = arr.length - 1; i >= 0; i--) {
			str2 += arr[i];
		}

		System.out.println(str2);

	}
}
