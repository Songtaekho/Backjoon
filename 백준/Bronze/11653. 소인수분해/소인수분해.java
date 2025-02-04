import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int a = 2;
		
		if(N == 1) {
			return;
		}
		
		while(true) {
			
			if(N % a == 0) {
				N = N /a;
				System.out.println(a);
			} else {
				a++;
			}
			
			if(N == 1) {
				break;
			}
		}
		
	}
}