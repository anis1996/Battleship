

public class Player2SetupState implements GameState{
	public void drawFrame(BattleShip bs)
	{
		bs.setState(new Player1AttackState());
		SelfGridSetup sgp = new SelfGridSetup("Player1", bs.Player2);
		AttackGrid ag = new AttackGrid("player1", bs.Player2);
		PlayerScreen player2 = new PlayerScreen("Player2", true,bs,sgp,ag);

	}
}
