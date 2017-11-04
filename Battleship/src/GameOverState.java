import javax.swing.*;

/**
 * Class that represents the state when the game is over
 */
public class GameOverState implements GameState{
	private String winner; //is the winner of the game

	public GameOverState(String winner){
		this.winner = winner;
	}

	@Override
	public void drawFrame(BattleShip bs)
	{
		//Creates a new Frame providing user to start a new game or  end session
		bs.setCurrentState(this);
		int option = JOptionPane.showConfirmDialog(null, this.toString() + "\n Start New Game",
				"", JOptionPane.YES_NO_OPTION);
		if(option == JOptionPane.YES_OPTION) {
			bs = new BattleShip();
			bs.drawFrame();
		}

	}

	@Override
	public void validate(){}

	@Override
	public String toString(){
		return ("Game Over..." + winner + " Won!!!");
	}
}
