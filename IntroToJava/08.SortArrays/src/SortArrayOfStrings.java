import java.util.Arrays;
import java.util.Scanner;


public class SortArrayOfStrings {
	public static void main(String[] args) {
		System.out.println("Enter number of towns");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		String[]  towns = new String[n];
		System.out.println("Enter names of towns");
		for (int i = 0; i < n; i++) {
			towns[i] = input.next();
		}
		
		Arrays.sort(towns);
		System.out.println("Your towns sorted alphabetically");
		for (int i = 0; i < n; i++) {
			System.out.println(towns[i]);
		}
	}
}
