import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
			
		int sum = 0;
		
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		String b = scan.next();
		
		for(int i = 0; i < b.length(); i++) {
			sum += b.charAt(i)-48;
		}
		System.out.println(sum);
	}
}