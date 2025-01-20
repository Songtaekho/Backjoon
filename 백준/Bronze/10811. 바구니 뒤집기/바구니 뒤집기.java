import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//백준 10811 바구니 바꾸기 - 아직 못품
		
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int M = scan.nextInt();
		
		int [] arr = new int[N];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i+1;
		}

		for(int a = 0; a < M; a++) {
			int i = scan.nextInt() -1; // 1
			int j = scan.nextInt() -1; // 2
			
			for(int b = i; b <= j; b++, j--) {
			int temp = arr[b];
			arr[b] = arr[j];
			arr[j] = temp;
			}
			
			
		}
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
			scan.close();
	}
	
}