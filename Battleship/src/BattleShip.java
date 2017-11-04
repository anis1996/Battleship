/**
 * Represents a BattleShipGame
 */
public class BattleShip {
	private GameState currentState; //current state of the game
	private GameState nextState;	//following state of the game
	//2 player objects
	public PlayerData player1;
	public PlayerData player2;

	public BattleShip()
	{
		nextState = new Player1SetupState();
		player1 = new PlayerData("p1");
		player2 = new PlayerData("p2");
		currentState = null;
	}

	public void setNextState(GameState gs)
	{
		nextState = gs;
	}

	public void reDrawFrame()
	{
		currentState.validate();
	}

	/**
	 * Calls the next state's draw method
	 */
	public void drawFrame()
	{
		nextState.drawFrame(this);
	}

	public PlayerData getData(String name)
	{
		return ((name == "p1")?player1:player2);
	}

	public PlayerData getEnemyData(String name)
	{
		return ((name == "p1")?player2:player1);
	}

	public GameState getCurrentState(){ return currentState; }

	public void setCurrentState(GameState gs){ this.currentState = gs; }

    public static void main(String[] args)  {

    	BattleShip game = new BattleShip();
    	game.drawFrame();
    }
}