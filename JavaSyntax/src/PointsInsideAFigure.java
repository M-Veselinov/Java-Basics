import java.util.Scanner;


public class PointsInsideAFigure {
	public static void main(String[] args) { 
		Scanner inputX = new Scanner(System.in);
		double x = inputX.nextDouble();
		
		Scanner inputY = new Scanner(System.in);
		double y = inputY.nextDouble();
		
		if (x >= 12.5 && x <= 22.5 && y >= 6 && y <= 8.5) {
			System.out.println("Inside");
		}
		else if (x >= 12.5 && x <= 17.5 && y >= 8.5 && y <= 13.5) {
			System.out.println("Inside");
		}
		else if (x >= 20 && x <= 22.5 && y >= 8.5 && y <= 13.5) {
			System.out.println("Inside");
		}
		else {
			System.out.println("Outside");
		}
	}
}
