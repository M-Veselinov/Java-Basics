import java.util.Scanner;


public class CountOfBitsOne {
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			int n = Integer.parseInt(input.next());
			
			int count = 0;
			
			
				while(n != 0) {
					if (n % 2 == 1) {
						count++;					
					}
					n/=2;
				}
				
			System.out.println(count);
		}
}
