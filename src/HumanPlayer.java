import java.util.Scanner;

public class HumanPlayer extends Player{
	
	public HumanPlayer(String name) {
		super(name);
	}

	
	public String generateRoshambo(Scanner choice){
			return choice.nextLine();
		}
	public String HumanPlayerName(Scanner choice){
		System.out.println("What is your name?");
		
		return choice.nextLine();
	}

	@Override
	public String generateRoshambo() {
		// TODO Auto-generated method stub
		return null;
	}
}
