import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String [] arr = scan.nextLine().trim().split(" ");
		
		int[] arr2 = new int[arr.length];
		
		String[] str = new String[arr.length];
		
		for(int j = 0; j < arr.length; j++) {
			for(int i = arr[j].length()-1; i >=0; i--) {
			str[j] += arr[j].charAt(i);
			str[j] = str[j].replace("null", ""); 
			}
		}
	
		for(int i = 0; i < arr.length; i++) {
			arr2[i] = Integer.parseInt(str[i]);
		}
		
		if(arr2[0] > arr2[1]) {
			System.out.println(arr2[0]);
		} else {
			System.out.println(arr2[1]);
		}
		
	}
}