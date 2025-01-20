import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int a = 0;
		Scanner scan = new Scanner(System.in);
		
		String S = scan.next();
		
		char [] arr2 = new char[26];
		for(char i = 'a'; i <= 'z'; i++) {
			arr2[a] += i;
			a++;
		}
		
		for(int j = 0; j < arr2.length; j++) {
			int a2 = S.indexOf(arr2[j]);
			System.out.print(a2 + " ");	
		}

	}
}