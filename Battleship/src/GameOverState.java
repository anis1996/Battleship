

public class GameOverState implements GameState{

	public void drawFrame(BattleShip bt)
	{
		bt.changeState(new Player1SetupState());
	}
}
