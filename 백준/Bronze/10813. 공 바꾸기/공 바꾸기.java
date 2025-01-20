import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt(); // 배열의 크기
		int M = scan.nextInt(); // 자리 바꾸기
		int temp = 0;
		
		int [] arr = new int[N];
	
		
			
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i+1;
		}
	
		
		for(int a = 0; a < M; a++) {
			int i = scan.nextInt();
			int j = scan.nextInt();
			temp = arr[i-1];
			arr[i-1] = arr[j-1];
			arr[j-1] = temp;
			
		}
		for(int i =0; i < arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
			scan.close();
	}
}