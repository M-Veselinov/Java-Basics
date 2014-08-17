import java.util.Scanner;


public class DecimalToHexademical {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int decimal = Integer.parseInt(sc.next());
		String hex = Integer.toHexString(decimal);
		System.out.println(hex);
	}
}
