public class Player2AttackState implements GameState{

	private PlayerScreen ps;

	public Player2AttackState(PlayerScreen ps){
		this.ps = ps;
	}

	public void drawFrame(BattleShip bs)
	{
		SelfGrid sg;
		AttackGrid ag;
		bs.setCurrentState(this);
		// if(bs.Player2.PlayerStatus())
  //       {
		// 	bs.setState(new GameOverState());
		// 	sg = new SelfGrid("Player1", bs.Player2,true);
		// 	ag = new AttackGrid("player1", bs.Player1, false);
  //       }
		// else
		// {
		if(bs.getData("p1").sunkCount() >= 5){
			bs.setNextState(new GameOverState(ps, "p2"));
			// bs.drawFrame();
		}
		else{
			bs.setNextState(new Player1AttackState(ps));
			// sg = new SelfGrid(bs, "p2", false);
			// ag = new AttackGrid(bs, "p2", true);
			ps.addAttackGrid(new AttackGrid(bs, "p2", true));
			ps.addSelfGrid(new SelfGrid(bs, "p2", false));

			// PlayerScreen player2 = new PlayerScreen("p2", true, bs, sg, ag);
		}
		ps.reDraw();

	}

	@Override
	public String toString(){
		return "Player 2 Attack!!!";
	}
}
