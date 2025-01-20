import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int  N = scan.nextInt();
		int cnt = 0;
		
		for(int i = 1; i <= N + i; i += 6 * cnt) {
			cnt++;
			
			if(i >= N) {
				System.out.println(cnt);
				break;
			}
		
		}
		
	}
}