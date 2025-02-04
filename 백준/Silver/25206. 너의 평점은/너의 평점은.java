import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double sum =  0;
		double sum2 = 0;
		
		for(int i = 0; i < 20; i++) {
			String subject = scan.next();
			double grade = scan.nextDouble();
			String rating = scan.next();
			
			if(rating.equals("A+")) {
				sum += grade * 4.5;
				sum2 += grade;
			} else if(rating.equals("A0")) {
				sum += grade * 4.0;
				sum2 += grade;
			} else if(rating.equals("B+")) {
				sum += grade * 3.5;
				sum2 += grade;
			} else if(rating.equals("B0")) {
				sum += grade * 3.0;
				sum2 += grade;
			} else if(rating.equals("C+")) {
				sum += grade * 2.5;
				sum2 += grade;
			} else if(rating.equals("C0")) {
				sum += grade * 2.0;
				sum2 += grade;
			} else if(rating.equals("D+")) {
				sum += grade * 1.5;
				sum2 += grade;
			} else if(rating.equals("D0")) {
				sum += grade * 1.0;
				sum2 += grade;
			} else if(rating.equals("F")) {
				sum += grade * 0.0;
				sum2 += grade;
			}

		}
		System.out.println(sum/sum2);
	}
}
