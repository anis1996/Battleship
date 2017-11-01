public class Player2SetupState implements GameState{

    private PlayerScreen ps;

    public Player2SetupState(PlayerScreen ps){
        this.ps = ps;
    }

    public void drawFrame(BattleShip bs)
	{

		bs.setCurrentState(this);
		bs.setNextState(new Player1AttackState(ps));

		// SelfGrid sg = new SelfGrid(bs, "p2", true);
		// AttackGrid ag = new AttackGrid(bs, "p2",false);
		// PlayerScreen player2 = new PlayerScreen("p2", true, bs, sg, ag);

        ps.addAttackGrid(new AttackGrid(bs, "p2", false));
        ps.addSelfGrid(new SelfGrid(bs, "p2", true));
        ps.reDraw();
	}

	@Override
  	public String toString(){
    	return "Player 2, Lay your ships!!!";
  	}
}
