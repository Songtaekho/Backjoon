import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		
		int [] arr = new int [N];
		int M = scan.nextInt();
		for(int i = 0; i < M; i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			int c = scan.nextInt();
			for(int j = a; j <= b; j++) {
				arr[j-1] = c;
				
			}
		
		}
		for(int i =0; i < N; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}