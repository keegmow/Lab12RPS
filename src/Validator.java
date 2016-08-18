import java.util.Scanner;

public class Validator {
    public static void getString(String human, String prompt, String cpuChoice)
    {
        System.out.print(prompt);
        String human = Human.generateRoshambo();  // read user entry
        boolean result = true;
        String win = "";
        String humanWin = "You have won.";
        String robotWin = "Your opponent has won.";
        String noWin = "Tie game.";
        		
        
        human = human.toLowerCase();
        String robot = cpuChoice.toLowerCase();
        
		if (human.equalsIgnoreCase(Roshambo.ROCK.toString()))
			System.out.println("You have chosen rock.");
		else if (human.equalsIgnoreCase(Roshambo.PAPER.toString()))
        	System.out.println("You have chosen paper.");
		else if (human.equalsIgnoreCase(Roshambo.SCISSORS.toString()))
			System.out.println("You have chosen scissors.");
		else {
			result = false;
		}
			
		if (robot.equalsIgnoreCase(Roshambo.ROCK.toString()))
			System.out.println("Your opponent chose rock.");
		else if (robot.equalsIgnoreCase(Roshambo.PAPER.toString()))
        	System.out.println("Your opponent chose paper.");
		else if (robot.equalsIgnoreCase(Roshambo.SCISSORS.toString()))
			System.out.println("Your opponent chose scissors.");
		
        
        if (human.equalsIgnoreCase(robot)) {
        	win = noWin;
        } else {
        
	        if (human.equals("rock")) {
	        	if (robot.equals("paper"))
	        		win = robotWin;
	        	else if (robot.equals("scissors"))
	        		win = humanWin;
	        } else if (human.equals("paper")) {
	        	if (robot.equals("scissors"))
	        		win = robotWin;
	        	else if (robot.equals("rock"))
	        		win = humanWin;
	        } else if (human.equals("scissors"))
	        	if (robot.equals("rock"))
	        		win = robotWin;
	        	else if ( robot.equals("paper"))
	        		win = humanWin;
        }
        System.out.println(win);
//        return win;
    }
}
 