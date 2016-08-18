
public class Player {
	//playerName, set, get
	public String humanPlayer;
	public String getHumanPlayer() {
		return humanPlayer;
	}

	public void setHumanPlayer(String humanPlayer) {
		this.humanPlayer = humanPlayer;
	}

	public String theRock;
	public String random;
	
	//Roshambo value will be 3 (rock, paper, scissors)
		public Roshambo generateRoshambo(){
			return Roshambo.Rock;
		}
	
	//generate roshambo
	
	
}
