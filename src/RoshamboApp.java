import java.util.Scanner;

public class RoshamboApp {

	public static void main (String [] args) {
		Scanner scan = new Scanner (System.in);
		String again;
		Player opponent = null;
        String opponentName1 = "1";
        String opponentName2 = "2";
        boolean result = true;
        String robotChoice;
        
		System.out.print("What is your name:");
		HumanPlayer human1 = new HumanPlayer(scan.nextLine());
		
		do {			
			 do {
				 System.out.print(human1.getPlayer() + ", Who would you like to challenge? Opponent (1 or 2): ");
					robotChoice = scan.nextLine();
					
					if (robotChoice.equalsIgnoreCase(opponentName1)) {
						opponent = new RockPlayer(opponentName1);
						result = false;
					} else if (robotChoice.equalsIgnoreCase(opponentName2)) {
						opponent = new RandomPlayer(opponentName2);
						result = false;
					} else {
						System.out.println("Incorrect selection. Please try again.");
						result = true;
					}
				} while (result);
			
			System.out.println();
			Validator.getString(human1.getPlayer(), "What is your choice? (Rock/Paper/Scissors) : ", robotChoice, scan, human1, opponent);
			System.out.print("Would you like to play again? (Y/N): ");
			again = scan.nextLine().trim();
			System.out.println();
		} while (again.equalsIgnoreCase("y"));
		System.out.println("Thanks for playing.");
	}
}
