import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String str = scan.next();

		String[] arr = str.split("");

		int cnt = 0;

		for (int j = 0; j < arr.length - 2; j++) {
			if (arr[j].equals("d") && arr[j + 1].equals("z") && arr[j + 2].equals("=")) {
				arr[j] = "";
				arr[j + 1] = "";
				arr[j + 2] = "";
				cnt++;
			}
		}

		for(int i = 0; i < arr.length -1; i++) {
			if((arr[i].equals("c") && arr[i+1].equals("=")) || (arr[i].equals("c") && arr[i+1].equals("-")) || (arr[i].equals("d") && arr[i+1].equals("-")) || (arr[i].equals("l") && arr[i+1].equals("j")) || (arr[i].equals("n") && arr[i+1].equals("j")) || (arr[i].equals("s") && arr[i+1].equals("=")) || (arr[i].equals("z") && arr[i+1].equals("=")) ) {
				arr[i] = "";
				arr[i+1] = "";
				cnt++;
			
			}
		}

		for(int i = 0; i < arr.length; i++) {
			if(!(arr[i].equals(""))) {
				cnt++;
			}
		}

		
		
		System.out.println(cnt);

	}

}