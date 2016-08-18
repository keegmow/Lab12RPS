import java.util.Scanner;

public class RoshamboApp {

	public static void main (String [] args) {
		Scanner scan = new Scanner (System.in);
		String again;
		do {
			String robotChoice = "rock";
			Validator.getString(scan, "What is your choice? (Rock/Paper/Scissors) : ", robotChoice);
			System.out.print("Would you like to play again? (Y/N): ");
			again = scan.nextLine();
		} while (again.equalsIgnoreCase("y"));
		
	}
}
