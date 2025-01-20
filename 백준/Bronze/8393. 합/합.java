import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int a= 1;
		int sum = 0;
		int n = scan.nextInt();
		
		while(a<= n) {
			sum += a;
			
			a++;
		}
		System.out.println(sum);
		scan.close();
}
}