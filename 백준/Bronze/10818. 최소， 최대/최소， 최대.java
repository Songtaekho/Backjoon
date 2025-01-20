import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[] arr = new int [N];
		
		
		
		
		
		
		for(int i = 0; i < arr.length ; i++) {
			int A = scan.nextInt();
			arr[i] = A;
		}
		int max = arr[0];
		int min = arr[0];
		for(int i = 0; i < arr.length ; i++) {
			
			if(max < arr[i]) {
				max = arr[i];
			}
			
			if(min > arr[i]){
				min = arr[i];
			}
		}
		System.out.println(min + " " + max);
	}
}