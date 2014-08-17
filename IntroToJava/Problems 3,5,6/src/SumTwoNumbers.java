import java.util.Scanner;


public class SumTwoNumbers {
	public static void main(String[] args) {
	//first number
	Scanner reader = new Scanner(System.in);
	int a = reader.nextInt();
	//second number
	Scanner readerB = new Scanner(System.in);
	int b = readerB.nextInt();
	
	int result = a + b;
	
	System.out.println(result);
	}
}
