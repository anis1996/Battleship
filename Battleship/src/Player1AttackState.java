public class Player1AttackState implements GameState{

	public void drawFrame(BattleShip bs)
	{
		bs.setState(new Player2AttackState());
		PlayerScreen player1 = new PlayerScreen("Player1", true, bs);
	}
}
