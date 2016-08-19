
public abstract class Player {
	private String playerName;
	
	public Player(String name) {
		setPlayer(name);
	}
	//playerName, set, get
	public void setPlayer(String playerName) {
		this.playerName = playerName;
	}
	public String getPlayer() {
		return playerName;
	}
	
	//Roshambo value will be 3 (rock, paper, scissors)
	public abstract String generateRoshambo();
			
	
}
