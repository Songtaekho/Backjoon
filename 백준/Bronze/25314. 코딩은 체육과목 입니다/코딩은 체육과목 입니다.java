import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		
		for(int i = 1; i <= n ; i++) {
			if(i % 4 ==0) {
				System.out.print("long ");
			}
		}
			System.out.println("int");
		scan.close();
	}

}