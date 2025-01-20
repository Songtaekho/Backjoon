import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int [] arr = new int[N];
		double max = 0;
		double sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
			if(max < arr[i]) {
				max = arr[i];
			}
	
		}
		
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i]/max*100;
		}
		System.out.println(sum/N);
	}
}