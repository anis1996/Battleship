public class Player1SetupState implements GameState {

	public void drawFrame(BattleShip bs)
	{
		bs.setState(new Player2SetupState());
		SelfGrid sg = new SelfGrid("Player1", bs.Player1);
		AttackGrid ag = new AttackGrid("player1", bs.Player1);
		PlayerScreen player1 = new PlayerScreen("Player1", true, bs, sg, ag);
	}

    public void drawDefenseFrame(){}
}
