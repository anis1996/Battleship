

public class Player2SetupState implements GameState{
	public void drawFrame(BattleShip bs)
	{
		bs.setCurrentState(this);
		bs.setNextState(new Player1AttackState());
		SelfGrid sg = new SelfGrid(bs, "p2", true);
		AttackGrid ag = new AttackGrid(bs, "p2",false);
		PlayerScreen player2 = new PlayerScreen("p2", true, bs, sg, ag);
	}

	@Override
  	public String toString(){
    	return "Player 2, Lay your ships!!!";
  	}
}
