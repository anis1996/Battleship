import java.io.IOException;
import java.io.InputStreamReader;

public class BattleShip {

	private GameState state ;

	public BattleShip()
	{
		state = new Player1SetupState();
	}

	public void changeState(GameState gt)
	{
		state = gt;
	}

	public void drawFrame()
	{
		state.drawFrame(this);
	}

    public static void main(String[] args) throws IOException {

    	BattleShip game = new BattleShip();

    	game.drawFrame();


//        PlayerScreen player1 = new PlayerScreen("Player1", true);
        //PlayerScreen player2 = new PlayerScreen("Player2", false);

    }
}