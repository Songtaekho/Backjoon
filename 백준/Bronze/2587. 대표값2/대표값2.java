

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] arr = new int[5];

		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
			sum += arr[i];
		}

		Arrays.sort(arr);

		System.out.println(sum / 5);
		System.out.println(arr[2]);

	}
}
