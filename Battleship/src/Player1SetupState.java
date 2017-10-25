public class Player1SetupState implements GameState {

	public void drawFrame(BattleShip bs)
	{
		bs.setState(new Player2SetupState());
		AttackGrid ag = new AttackGrid("player1", bs.Player1);
		SelfGridSetup sgp = new SelfGridSetup("Player1", bs.Player1, bs, ag);
		
		PlayerScreen player1 = new PlayerScreen("Player1", true, bs, sgp, ag);
	}
}
