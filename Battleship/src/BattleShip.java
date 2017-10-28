import java.io.IOException;
import java.io.InputStreamReader;

public class BattleShip {
	public GameState currentState;
	public GameState nextState;
	public PlayerData Player1;
	public PlayerData Player2;
	public BattleShip()
	{
		nextState = new Player1SetupState();
		Player1 = new PlayerData("Player1");
		Player2 = new PlayerData("Player2");
		currentState = null;
	}

	public void setNextState(GameState gs)
	{
		nextState = gs;
	}

	public void drawFrame()
	{
		nextState.drawFrame(this);
	}

	public GameState getCurrentState(){ return currentState; }

	public void setCurrentState(GameState gs){ this.currentState = gs; }

    public static void main(String[] args)  {

    	BattleShip game = new BattleShip();
    	game.drawFrame();
    }
}