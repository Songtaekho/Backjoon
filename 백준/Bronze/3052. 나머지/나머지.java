import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int [] arr = new int[10];
		
		for(int i = 0; i < 10; i++) {
			arr[i] = scan.nextInt()%42;
		}
		
		int cnt = 0;
		for(int i = 0; i < arr.length-1; i++) {
			for(int j = i+1; j < arr.length; j++) {
				if(arr[i] == arr[j]) {
					cnt++;
					break;
				}
				
			}
			
		}
		System.out.println(arr.length-cnt);
	}
	
}