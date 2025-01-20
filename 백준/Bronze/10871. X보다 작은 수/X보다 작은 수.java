import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		//백준 = 배열 x보다 작은수
		
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int X = scan.nextInt();
		
		
		
	
		
		int [] arr = new int [N];
		
		for(int i = 0; i < arr.length; i++) {
			int A = scan.nextInt();
			arr [i] = A;
			if(X > arr[i]) {
				System.out.print(arr[i]+" ");
			}
			
		}
		
	}
}