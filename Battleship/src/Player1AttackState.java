public class Player1AttackState implements GameState{

	public void drawFrame(BattleShip bs)
	{
		bs.setState(new Player2AttackState());
		SelfGrid sg = new SelfGrid("Player1", bs.Player1);
		AttackGrid ag = new AttackGrid("player1", bs.Player1);
		PlayerScreen player1 = new PlayerScreen("Player1", true, bs, sg,ag);
	}
}
