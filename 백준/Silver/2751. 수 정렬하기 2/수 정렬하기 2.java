

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());

		int[] arr = new int[N];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}

		Arrays.sort(arr);

		sb.append(arr[0]).append('\n');

		int a = 0;

		for (int i = 1; i < arr.length; i++) {
			if (arr[a] != arr[i]) {
				sb.append(arr[i]).append('\n');
				a++;
			}
		}
		System.out.println(sb);

	}
}
