import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		while (true) {

			int n = scan.nextInt();
			int sum = 0;

			int j = 0;

			if (n == -1) {
				break;
			}

			int[] arr = new int[n];

			for (int i = 1; i < n; i++) {
				if (n % i == 0) {
					sum += i;
					arr[j] = i;
					j++;
				}
			}

			int max = 0;

			for (int i = 0; i < arr.length; i++) {
				if (max < arr[i]) {
					max = arr[i];
				}
			}

			if (n == sum) {
				System.out.print(n + " = ");
				for (int i = 0; i < arr.length; i++) {
					if (i == arr.length - 1 && arr[i] != 0) {
						System.out.print(arr[i]);
					} else {
						if (arr[i] == max) {
							System.out.print(arr[i]);
						} else if (arr[i] != 0) {
							System.out.print(arr[i] + " + ");
						}
					}
				}
				System.out.println();
			} else {
			
				System.out.println(n + " is NOT perfect.");
			}
		}

	}
}
