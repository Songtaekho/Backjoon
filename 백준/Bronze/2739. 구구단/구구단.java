import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		
		int b = 0;
		
		while(b < 9) {
			
			b++;
			
			System.out.println(a + " * " + b + " = " + (a*b));
		}
		
}
}