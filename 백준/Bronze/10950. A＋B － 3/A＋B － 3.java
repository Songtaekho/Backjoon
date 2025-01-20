import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int T = scan.nextInt();
		int[] arr = new int [T]; 
		int i = 0;
		while(i < arr.length) {
		int A = scan.nextInt();
		int B = scan.nextInt();
		arr[i] = A+B;
		System.out.println(arr[i]);
			i++;
		}
		
		scan.close();
	}

}