public class Player1SetupState implements GameState {

	public void drawFrame(BattleShip bt)
	{
		bt.changeState(new Player2SetupState());

		PlayerScreen player1 = new PlayerScreen("Player1", true,bt);
	}
}
