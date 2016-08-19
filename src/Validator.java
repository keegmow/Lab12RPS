import java.util.Scanner;

public class Validator {
    public static void getString(String humanName, String prompt, String cpuChoice, Scanner scan, HumanPlayer h, Player opponent)
    {
        boolean result = true;
        String robot = ""	;
        String human;

		robot = opponent.generateRoshambo()
						.toLowerCase();
        
        do { //prompts user for RPS choice. Repeats if the make an incorrect choice. Repeats back to the user the choice they made.
            System.out.print(prompt);
			human = h.generateRoshambo(scan)
					 .toLowerCase()
					 .trim(); // read user entry
			
			if (human.equalsIgnoreCase(Roshambo.ROCK.toString())){
				System.out.println(humanName + ", You chose rock.");
				result = false;
			} else if (human.equalsIgnoreCase(Roshambo.PAPER.toString())) {
				System.out.println(humanName + ", You chose paper.");
				result = false;
			} else if (human.equalsIgnoreCase(Roshambo.SCISSORS.toString())){
				result = false;
				System.out.println(humanName + ", You chose scissors.");
			} else {
				System.out.println("Incorrect Entry. Please try again.");
				result = true;
			}
		} while (result);
        
        
        // this outputs the opponents choice
		if (robot.equalsIgnoreCase(Roshambo.ROCK.toString()))
			System.out.println("Your opponent chose rock.");
		else if (robot.equalsIgnoreCase(Roshambo.PAPER.toString()))
        	System.out.println("Your opponent chose paper.");
		else if (robot.equalsIgnoreCase(Roshambo.SCISSORS.toString()))
			System.out.println("Your opponent chose scissors.");
		
		
		//these variables set up win messages.
		String win = "";
		String noWin = "Tie game.";
		String humanWin = humanName + ", You have won.";
		String robotWin = "Opponent " + opponent.getPlayer() + " has won.";
		
//		human = "paper";   //Test
//		robot = "rock";    //Test
		
		
		//The following block tests results and prints the results to the console.
        
        if (human.equals(robot)) {
        	win = noWin;
        } else if (human.equals("rock")) {
        	if (robot.equals("paper")) {
        		win = robotWin;
        	} else if (robot.equals("scissors")) {
        		win = humanWin;
        	}
        } else if (human.equals("paper")) {
        	if (robot.equals("scissors")) {
        		win = robotWin;
        	}
        	else if (robot.equals("rock")) {
        		win = humanWin;
        	}
        } else if (human.equals("scissors")) {
        	if (robot.equals("rock")) {
        		win = robotWin;
        	}
        	else if ( robot.equals("paper")) {
        		win = humanWin;
        	}
        }
        System.out.println("\n" + win + "\n");
//        return win;
    }
}
 