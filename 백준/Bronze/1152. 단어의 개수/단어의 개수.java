import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String str = scan.nextLine();
		String[] arr = str.trim().split(" ");
	
		if(arr[0].equals("")) {
			System.out.println(arr.length-1);
		} else {
			System.out.println(arr.length);
		}
	}
}