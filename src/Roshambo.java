public enum Roshambo { 
	ROCK, 
	PAPER, 
	SCISSORS;
	
	public String toString() {
		String s = "";
		if (ordinal() == 0){
			s = "rock";
		} else if (ordinal() == 1) {
			s = "paper";
		} else if (ordinal() == 2) {
			s = "scissors";
		}
		return s;
	}
}