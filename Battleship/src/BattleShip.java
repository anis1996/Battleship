import java.io.IOException;
import java.io.InputStreamReader;

public class BattleShip {
	public GameState currentState;
	public GameState nextState;
	public PlayerData player1;
	public PlayerData player2;
	public PlayerScreen screen;
	public BattleShip()
	{
		currentState = null;
		player1 = new PlayerData("p1");
		player2 = new PlayerData("p2");

	}

	public void setNextState(GameState gs)
	{
		nextState = gs;
	}

	public void reDrawFrame()
	{
		screen.reDraw();
	}

	public void drawFrame()
	{
		screen = new PlayerScreen(this, "p1", true);
		nextState = new Player1SetupState(screen);
		// screen.drawFrame();
		// nextState.drawFrame(this);
	}

	public PlayerData getData(String name)
	{
		return ((name == "p1")?player1:player2);
	}

	public GameState getCurrentState(){ return currentState; }

	public void setCurrentState(GameState gs){ this.currentState = gs; }

    public static void main(String[] args)  {

    	BattleShip game = new BattleShip();
    	game.drawFrame();
    }
}