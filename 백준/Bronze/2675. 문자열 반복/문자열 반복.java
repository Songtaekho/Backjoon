import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//문자열 반복
		
		Scanner scan = new Scanner(System.in);
		
		
		
		int R = scan.nextInt();
		
		for(int i = 0; i < R; i++) {
			int a = scan.nextInt();
			String S = scan.next();
			
			String str = "";
			
			
				
			for(int j = 0; j < S.length(); j++) {
				for(int k = 0; k < a; k++) {
					str += S.charAt(j);
				}
				
				
			}
			
			System.out.println(str);
		
		}

	}
}