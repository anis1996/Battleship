public class Player2AttackState implements GameState{
	public void drawFrame(BattleShip bt)
	{
		bt.changeState(new Player1AttackState());
		PlayerScreen player2 = new PlayerScreen("Player2", true,bt);
	}
}
