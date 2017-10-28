public class Player1SetupState implements GameState {

	public void drawFrame(BattleShip bs)
	{	
		bs.setCurrentState(this);
		bs.setNextState(new Player2SetupState());
		SelfGrid sg = new SelfGrid("Player1", bs.Player1, true);
		AttackGrid ag = new AttackGrid("player1", bs.Player1, false);
		PlayerScreen player1 = new PlayerScreen("Player1", true, bs, sg, ag);
	}

    @Override
  	public String toString(){
    	return "Player 1, Lay your ships!!!";
  	}
}
