import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] arr = scan.next().split("");
		
		
		int sum = 0;
		
		
		for(int i =0; i < arr.length; i++) {
			int cnt = 2;
			if(arr[i].equals("A")  ||arr[i].equals("B") || arr[i].equals("C")) {
				 cnt+= 1;
			} else if(arr[i].equals("D") || arr[i].equals("E") || arr[i].equals("F")) {
				cnt += 2;
			} else if(arr[i].equals("G") || arr[i].equals("H") || arr[i].equals("I")) {
				cnt += 3;
			} else if(arr[i].equals("J") || arr[i].equals("K") || arr[i].equals("L")) {
				cnt += 4;
			} else if(arr[i].equals("M") || arr[i].equals("N") || arr[i].equals("O")) {
				cnt += 5;
			} else if(arr[i].equals("P") || arr[i].equals("Q") || arr[i].equals("R") || arr[i].equals("S")) {
				cnt += 6;
			} else if(arr[i].equals("T") || arr[i].equals("U") || arr[i].equals("V")) {
				cnt += 7;
			} else if(arr[i].equals("W") || arr[i].equals("X") || arr[i].equals("Y") ||arr[i].equals("Z")) {
				cnt += 8;
			}
		
			sum += cnt;
		}
		System.out.println(sum);
		
	}
}