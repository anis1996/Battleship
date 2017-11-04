public class Player2AttackState implements GameState{
	public void drawFrame(BattleShip bs)
	{
		SelfGrid sg;
		AttackGrid ag;
		bs.setCurrentState(this);

		if(bs.getData("p2").sunkCount() >= 5){
		  bs.setNextState(new GameOverState("p1"));
		  bs.drawFrame();
		 }
		else{
			bs.setNextState(new Player1AttackState());
			sg = new SelfGrid(bs, "p2", false);
			ag = new AttackGrid(bs, "p2", true);
			PlayerScreen player2 = new PlayerScreen("p2", true, bs, sg, ag);
		}
	}

	public void validate()
	{}
	@Override
  	public String toString(){
    	return "Player 2 Attack!!!";
  	}
}
