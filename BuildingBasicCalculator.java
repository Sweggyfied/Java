import java.util.Scanner;

public class BuildingBasicCalculator {
	public static void main(String args[]){
		Scanner TypedNum = new Scanner(System.in);
		double fnum, snum, answer;
		System.out.println("Enter first number: ");
		fnum = TypedNum.nextDouble();
		System.out.println("Enter your second number: ");
		snum = TypedNum.nextDouble();
		answer = fnum + snum;
		System.out.println("Your Answer is: " + answer);
	}
}
