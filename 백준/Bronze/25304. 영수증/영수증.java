import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int n = scan.nextInt();
		int sum = 0;
		int i = 1;
		
		while(i<=n) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			
				sum += a*b;
			
			i++;
		}
			if(sum == x) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		scan.close();
	}
	
}