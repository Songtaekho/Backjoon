import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();

		int b = 1;
		
		int c = 0;
		
		for(int i = 0; i < N; i++) {
			
			c += b;
			
			b = b*2;
		}
		System.out.println((2+c)*(2+c));
	}
}