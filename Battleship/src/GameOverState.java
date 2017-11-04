import javax.swing.*;

public class GameOverState implements GameState{
	private String winner;

	public GameOverState(String winner){
		this.winner = winner;
	}
	public void drawFrame(BattleShip bs)
	{
		bs.setCurrentState(this);
		int option = JOptionPane.showConfirmDialog(null, "Game over: " + winner + " Won!!!" + "\n Start New Game",
				"", JOptionPane.YES_NO_OPTION);
		if(option == JOptionPane.YES_OPTION) {
			bs = new BattleShip();
			bs.drawFrame();
		}

	}
	public void validate()
	{}
	@Override
	public String toString(){
		return ("Game Over..." + winner + " won");
	}
}
