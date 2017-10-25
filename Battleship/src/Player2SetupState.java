

public class Player2SetupState implements GameState{
	public void drawFrame(BattleShip bs)
	{
		bs.setState(new Player1AttackState());
<<<<<<< HEAD
=======
		SelfGrid sgp = new SelfGrid("Player1", bs.Player2, false);
>>>>>>> 1a1fa5ed7ff17ce745c4f86bb8b5d1bd2b836645
		AttackGrid ag = new AttackGrid("player1", bs.Player2);
		SelfGridSetup sgp = new SelfGridSetup("Player1", bs.Player2, bs, ag);
		PlayerScreen player2 = new PlayerScreen("Player2", true,bs,sgp,ag);

	}
}
