import java.util.Random;

public class RandomPlayer extends Player {
	private static String getRandom(){
		Random randomNumber = new Random();
		
		int computerNumber = randomNumber.nextInt(3);
		
		String computerMoveChoice;
		if (computerNumber == 0){
			computerMoveChoice = "rock";
		}else if (computerNumber == 1) {
			computerMoveChoice = "paper";
		}else{
			computerMoveChoice = "scissors";
		}
		return computerMoveChoice;
	}
}
