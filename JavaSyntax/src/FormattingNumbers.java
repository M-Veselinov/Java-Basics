import java.util.Scanner;


public class FormattingNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = Integer.parseInt(sc.next());
		double b = Double.parseDouble(sc.next());
		double c = Double.parseDouble(sc.next());
		String hex = Integer.toHexString(a);
		String binary = Integer.toBinaryString(a);
		System.out.printf("|"+hex + "       |");
		System.out.printf("0"+ binary + "|");
		System.out.printf("|" + "%10.2f"+ "|",b);
		System.out.printf("%10.3f"+"|",c);
	}
}
