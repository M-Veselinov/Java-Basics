import java.util.ArrayList;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Scanner;


public class AngleUnitConverter {
	public static void main(String[] args) {
		ArrayList<Double> numbers = new ArrayList<>();
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		for (int i = 0; i < n; i++) {
			double value = input.nextDouble();
			String measure = input.next();
			numbers.add(Converter(value,measure));
		}
		for (Double converted : numbers) {
			System.out.printf("%.6f\n", converted);
		}
	}
	private static double Converter(double value,String measure) {
		if (measure.equals("rad")) {
			return Math.toDegrees(value);
		}
		else {
			return Math.toRadians(value);
		}
	}
}
