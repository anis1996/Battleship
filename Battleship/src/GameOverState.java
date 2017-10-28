

public class GameOverState implements GameState{

	public void drawFrame(BattleShip bs)
	{
		bs.setCurrentState(this);
		bs = new BattleShip();
		bs.drawFrame();
		// bs.setState(new Player1SetupState());
		// SelfGrid sg = new SelfGrid("Player1", bs.Player2,true);
		// AttackGrid ag = new AttackGrid("player1", bs.Player2,false);
		// PlayerScreen player2 = new PlayerScreen("Player2", true, bs, sg, ag);
	}
}
