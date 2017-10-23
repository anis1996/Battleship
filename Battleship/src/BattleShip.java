import java.io.IOException;
import java.io.InputStreamReader;

public class BattleShip {
	public GameState state ;
	public PlayerData Player1;
	public PlayerData Player2;
	public BattleShip()
	{
		state = new Player1SetupState();
		Player1 = new PlayerData("Player1");
		Player2 = new PlayerData("Player2");
	}
	
	public void changeState(GameState gt)
	{
		state = gt;
	}
	
	public void drawFrame()
	{
		state.drawFrame(this);
	}
	
    public static void main(String[] args)  {
    	
    	BattleShip game = new BattleShip();
    	game.drawFrame();
    	
    	
//        PlayerScreen player1 = new PlayerScreen("Player1", true);
        //PlayerScreen player2 = new PlayerScreen("Player2", false);
        

    }
}