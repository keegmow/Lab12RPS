
public abstract class Player {
	//playerName, set, get
	public String humanPlayer;
	public String getHumanPlayer() {
		return humanPlayer;
	}

	public void setHumanPlayer(String humanPlayer) {
		this.humanPlayer = humanPlayer;
	}
	
	//Roshambo value will be 3 (rock, paper, scissors)
		public abstract String generateRoshambo();
			
	
}
