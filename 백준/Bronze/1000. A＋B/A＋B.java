
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		/*
		 * 두 정수 A B를 한번에 입력받은 다음에 A + B의 결과를 출력하는 프로그램 코드
		 * 
		 * 입력
		 * 1 2
		 * 출력
		 * 3
		 * 
		 */
		
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();	
		int num2 = scan.nextInt();	
	
		System.out.println(num + num2);
		
		scan.close();
		
		
	}
}