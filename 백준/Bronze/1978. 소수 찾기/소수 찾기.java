import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int [] arr = new int[N];
		int count = 0;
		
		for(int i = 0; i < arr.length; i++) {
			int cnt = 0;
			arr[i] = scan.nextInt();
			for(int j = 1; j <= arr[i]; j++) {
				if(arr[i] % j == 0) {
					cnt++;	
				}
			}
			if(cnt == 2) {
				count++ ;
			}
		}
		System.out.println(count);
	}
}