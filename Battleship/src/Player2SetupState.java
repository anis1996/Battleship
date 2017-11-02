import java.awt.*;

public class Player2SetupState implements GameState{
	PlayerScreen player2;
	SelfGrid sg;
	AttackGrid ag;
	BattleShip bs;
	public void drawFrame(BattleShip bs)
	{
		this.bs = bs;
		bs.setCurrentState(this);
		bs.setNextState(new Player1AttackState());
		sg = new SelfGrid(bs, "p2", true);
		ag = new AttackGrid(bs, "p2",false);
		player2 = new PlayerScreen("p2", true, bs, sg, ag);
	}

	public void validate()
	{
		sg = new SelfGrid(bs, "p2", true);
		ag = new AttackGrid(bs, "p2",false);
		player2.add(sg, BorderLayout.EAST );
		player2.add(ag, BorderLayout.WEST );
		player2.revalidate();
	}

	@Override
  	public String toString(){
    	return "Player 2, Lay your ships!!!";
  	}
}
