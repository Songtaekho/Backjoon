import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		char[][] str = new char[5][15];

		String a = "";
		for (int i = 0; i < str.length; i++) {
			a = scan.next();
			for (int j = 0; j < a.length(); j++) {
				str[i][j] = a.charAt(j);
			}
		}
		for (int i = 0; i < 15; i++) {
			for (int j = 0; j < str.length; j++) {
				if (!(str[j][i] == 0)) {
					System.out.print(str[j][i]);
				}
			}
		}
	}
}