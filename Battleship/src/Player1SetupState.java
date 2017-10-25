public class Player1SetupState implements GameState {

	public void drawFrame(BattleShip bs)
	{
		bs.setState(new Player2SetupState());
		SelfGrid sgs = new SelfGrid("Player1", bs.Player1, false);
		AttackGrid ag = new AttackGrid("player1", bs.Player1);
		PlayerScreen player1 = new PlayerScreen("Player1", true, bs, sgs, ag);
	}

    public void drawDefenseFrame(){}
}
