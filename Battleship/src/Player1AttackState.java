public class Player1AttackState implements GameState{

	public void drawFrame(BattleShip bt)
	{
		bt.changeState(new Player2AttackState());
		PlayerScreen player1 = new PlayerScreen("Player1", true, bt);
	}
}
