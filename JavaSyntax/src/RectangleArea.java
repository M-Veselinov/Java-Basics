import java.util.Scanner;


public class RectangleArea {
	public static void main(String[] args) { 
		
		Scanner inputA = new Scanner(System.in);
		int a = inputA.nextInt();
		
		Scanner inputB = new Scanner(System.in);
		int b = inputB.nextInt();
		
		int area = a*b;
		System.out.println(area);
	}
}
