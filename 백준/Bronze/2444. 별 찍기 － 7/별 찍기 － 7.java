import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int star = scan.nextInt();
		
		for(int i = 1; i <= star; i++) {
			
			for(int j = 1; j <= star-i; j++) {//공백 출력
				System.out.print(" ");
			}
			for(int j = 1; j <= i; j++) {
				if(j == 1) {
					System.out.print("*");
				} else if(j > 1) {
					System.out.print("**");
				}
			}
			System.out.println();
		}

		for(int i = star-1; i >= 1; i--) {
			
			for(int j = star-1; j >= i; j--) {
				System.out.print(" ");
			}
			System.out.print("*");
			for(int j = i; j > 1 ; j--) {
				if(j > 1) {
					System.out.print("**");
				}
			}
			System.out.println();
		}
	}
}