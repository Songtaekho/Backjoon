

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());

		int M = (int) Math.round(N * 0.15);

		int[] arr = new int[N];

		for (int i = 0; i < arr.length; i++) {

			arr[i] = Integer.parseInt(br.readLine());

		}

		Arrays.sort(arr);

		double sum = 0;
		double cnt = 0;

		for (int i = 0; i < arr.length; i++) {

			if (i >= M && i <= arr.length - 1 - M) {
				sum += arr[i];
				cnt++;
			}

		}

		bw.write(String.valueOf((int) Math.round(sum / cnt)));

		bw.flush();
		br.close();
		bw.close();

	}
}
