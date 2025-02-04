import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int x = scan.nextInt();
		int y = scan.nextInt();

		int A[][] = new int[x][y];
		int B[][] = new int[x][y];

		for (int i = 0; i < A.length; i++) {

			for (int j = 0; j < A[i].length; j++) {
				A[i][j] = scan.nextInt();
			}
		}

		for (int i = 0; i < B.length; i++) {

			for (int j = 0; j < B[i].length; j++) {
				B[i][j] = scan.nextInt();
			}
		}

		for (int i = 0; i < A.length; i++) {

			for (int j = 0; j < A[i].length; j++) {
				int a = A[i][j] + B[i][j];
				System.out.print(a + " ");
			}
			System.out.println();
		}

	}

}