import java.util.Scanner;


public class TriangleArea {
	public static void main(String[] args) { 
		//input
		Scanner N = new Scanner(System.in);
		String firstPoint = N.nextLine();
		String[] firstLine = firstPoint.split(" ");
		int Ax = Integer.parseInt(firstLine[0]);
		int Ay = Integer.parseInt(firstLine[1]);
		
		String secondPoint = N.nextLine();
		String[] secondLine = secondPoint.split(" ");
		int Bx = Integer.parseInt(secondLine[0]);
		int By = Integer.parseInt(secondLine[1]);
		
		String thirdPoint = N.nextLine();
		String[] thirdLine = thirdPoint.split(" ");
		int Cx = Integer.parseInt(thirdLine[0]);
		int Cy = Integer.parseInt(thirdLine[1]);
		
		int area = (Ax*(By-Cy) + Bx*(Cy - Ay) + Cx*(Ay - By))/2;
		if (Ax+Bx > Cx || Bx + Cx > Ax || Cx+Ax>Bx) {
			System.out.println(area);
		}
		else {
			System.out.println(0);
		}
		
	}
}
