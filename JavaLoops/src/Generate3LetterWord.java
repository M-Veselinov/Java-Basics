import java.util.Scanner;


public class Generate3LetterWord {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		char[] letter = input.next().toCharArray();
		if (letter.length == 3) {
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					for (int k = 0; k < 3; k++) {
						System.out.printf("%s%s%s",letter[i],letter[j],letter[k]);
					}
				}
			}
		}
		else if (letter.length == 2) {
			for (int i = 0; i < letter.length; i++) {
				for (int j = 0; j < letter.length; j++) {
					for (int k = 0; k < letter.length; k++) {
						System.out.printf("%s%s%s",letter[i],letter[j],letter[k]);
					}
				}
			}
		}
		else {
			System.out.printf("%s%s%s",letter[0],letter[0],letter[0]);
		}
	}
}
