public class Player1SetupState implements GameState {

	public void drawFrame(BattleShip bs)
	{
		bs.setState(new Player2SetupState());

		PlayerScreen player1 = new PlayerScreen("Player1", true, bs);
	}
}
