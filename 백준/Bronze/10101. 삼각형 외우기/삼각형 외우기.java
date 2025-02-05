
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();

		
		
		if(a == 0 || b == 0 || c == 0) {
			System.out.println("Error");
		}

		if (a + b + c == 180) {
			
			if (a == 60 && b == 60 && c == 60) {
				System.out.println("Equilateral");
			}else if (a == b || a == c || b == c) {
				System.out.println("Isosceles");
			}else {
				System.out.println("Scalene");
			}

		} else {
			System.out.println("Error");
			return;
		}

	}
}
