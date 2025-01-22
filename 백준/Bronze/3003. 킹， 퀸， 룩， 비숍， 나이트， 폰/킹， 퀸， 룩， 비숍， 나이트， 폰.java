import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int [] arr = new int [6];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		
		if(arr[0] == 1) {
			System.out.print(0 + " ");
		} else {
			System.out.print( 1-arr[0]+ " ");
		}
		
		if(arr[1] == 1) {
			System.out.print(0+ " ");
		} else {
			System.out.print( 1-arr[1]+ " ");
		}
		
		if(arr[2] == 2) {
			System.out.print(0+ " ");
		} else {
			System.out.print( 2 - arr[2]+ " ");
		}
		
		if(arr[3] == 2) {
			System.out.print(0+ " ");
		} else {
			System.out.print( 2 - arr[3]+ " ");
		}
		
		if(arr[4] == 2) {
			System.out.print(0+ " ");
		} else {
			System.out.print( 2 - arr[4]+ " ");
		}
		
		if(arr[5] == 8) {
			System.out.print(0);
		} else {
			System.out.print(8 - arr[5]);
		}
	}
}