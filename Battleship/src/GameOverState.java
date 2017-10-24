

public class GameOverState implements GameState{

	public void drawFrame(BattleShip bs)
	{
		bs.setState(new Player1SetupState());
	}
}
