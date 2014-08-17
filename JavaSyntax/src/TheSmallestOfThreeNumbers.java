import java.util.Scanner;


public class TheSmallestOfThreeNumbers {
	public static void main(String[] args) { 
		Scanner inputA = new Scanner(System.in);
		double a = inputA.nextDouble();
		
		Scanner inputB = new Scanner(System.in);
		double b = inputB.nextDouble();
		
		Scanner inputC = new Scanner(System.in);
		double c = inputC.nextDouble();
		
		double smallest = Math.min(a, Math.min(b, c));
		System.out.println(smallest);
	}
}
