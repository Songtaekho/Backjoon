
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int x = 0;
		int y = 0;
		int firstx = 0;
		int firsty = 0;
		
		//세 점이 주어졌을 때, 축에 평행한 직사각형을 만들기 위해서 필요한 네 번째 점을 찾는 프로그램을 작성하시오.
		int x4 = 0;
		int y4 = 0;

		for (int i = 0; i < 3; i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			if (i == 0) {
				firstx = a;  //첫번쨰 좌표 저장
				firsty = b;
			} else if (i == 1) { //두번쨰 좌표 저장
				
					x = a;
					y = b;
			
			} else if (i == 2) {
				
				if(firstx == x) {
					x4= a;
				}else if(firstx != x && x == a) {
					x4= firstx;
				}else if(firstx != x && x != a) {
					x4= x;
				}
				
				if(firsty == y) {
					y4 = b;
				}else if(firsty != y && y == b) {
					y4 = firsty;
				}else if(firsty != y && y != b) {
					y4 = y;
				}
				
				
			}
	}
		System.out.println(x4 + " "+ y4);
	}
}