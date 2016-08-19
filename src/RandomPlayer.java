import java.util.Random;

public class RandomPlayer extends Player {
	public RandomPlayer(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public String generateRoshambo(){
		Random randomNumber = new Random();
		
		int computerNumber = randomNumber.nextInt(3);
		
		String computerMoveChoice = "";
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
