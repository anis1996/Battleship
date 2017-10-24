public class Player2AttackState implements GameState{
	public void drawFrame(BattleShip bs)
	{
		bs.setState(new Player1AttackState());
		PlayerScreen player2 = new PlayerScreen("Player2", true,bs);
	}
}
