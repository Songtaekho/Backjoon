import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String str = scan.next();
		int a = scan.nextInt();
		
		System.out.println(Integer.parseInt(str, a));
		
	}

}