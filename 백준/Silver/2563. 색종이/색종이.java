import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		int[][] arr = new int[100][100];

		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();
		int cnt = 0;

		for (int i = 0; i < N; i++) {

			int x = scan.nextInt()-1;
			int y = scan.nextInt()-1;
			
			for (int j = 0; j < 10; j++) {
				x++;
				arr[x][y] = 1;
				
				for (int k = 0; k < 10; k++) {
					arr[x][y] = 1;
					y++;
				}
				y -= 10;
			}
		}
		for(int i = 0; i < 100; i++) {
			
			for(int j = 0; j < 100; j++) {
				if(arr[i][j] == 1) {
					cnt++;
				}
			}
		}
//		Print2D p = new Print2D();
//		p.print2DArray(arr);
		System.out.println(cnt);
	}
}