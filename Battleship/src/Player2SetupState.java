import java.awt.*;

/**
 * Class that represents the setting up state for Player 1
 */
public class Player2SetupState implements GameState{
	PlayerScreen player2;
	SelfGrid sg;
	AttackGrid ag;
	BattleShip bs;

	@Override
	public void drawFrame(BattleShip bs)
	{
		this.bs = bs;
		bs.setCurrentState(this);
		bs.setNextState(new Player1AttackState());
		sg = new SelfGrid(bs, "p2", true);
		ag = new AttackGrid(bs, "p2",false);
		player2 = new PlayerScreen("p2", bs, sg, ag);
	}

	@Override
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
    	return "Player 2, Place your 5 Ships in Blue Grid(Left Side)!!!";
  	}
}
