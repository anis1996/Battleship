import java.io.IOException;
import java.io.InputStreamReader;

public class BattleShip {
	public GameState currentState;
	public GameState nextState;
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