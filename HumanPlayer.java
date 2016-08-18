import java.util.Scanner;

public class HumanPlayer {

	private static String getPlayerChoice(){
		System.out.println("Pick rock, paper or scissors.");
		Scanner choice = new Scanner(System.in);
		String playerChoice = choice.nextLine();
		if (CHOICES.contains(playerChoice)){
			return playerChoice;
		}
		throw new Exception(playerChoice);
	}
}
