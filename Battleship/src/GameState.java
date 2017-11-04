/**
 * Interface for the various states of the game
 */
public interface GameState {

	/**
	 * Draws the frame for the appropriate state
	 * @param bt is the BattleShip game to draw
	 */
	public void drawFrame(BattleShip bt);

	/**
	 * @return a string representation of the current State
	 */
	public String toString();

	/**
	 * Redraws the contents of the frame
	 */
	public void validate();
 
}