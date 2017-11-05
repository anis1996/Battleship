import java.awt.*;

/**
 * Class that represents the setting up state for Player 1
 */
public class Player1SetupState implements GameState {
    PlayerScreen player1;
    SelfGrid  sg;
    AttackGrid ag;
    BattleShip  bs;

    @Override
	public void drawFrame(BattleShip bs)
	{
	    this.bs = bs;

		bs.setCurrentState(this);
		bs.setNextState(new Player2SetupState());

        sg = new SelfGrid(bs, "Player 1", true);
        ag = new AttackGrid(bs, "Player 1", false);
        player1 = new PlayerScreen("Player 1", bs, sg, ag);
    }

    @Override
    public void validate()
    {
        sg = new SelfGrid(bs, "Player 1", true);
        ag = new AttackGrid(bs, "Player 1", false);

        player1.add(sg, BorderLayout.EAST );
        player1.add(ag, BorderLayout.WEST );
        player1.revalidate();
    }

    @Override
    public String toString(){
    	return "Player 1, Place your 5 Ships in Blue Grid(Right Side)!!!";
        return "Place your 5 ships on blue grid. Click twice to rotate "
    }
}
