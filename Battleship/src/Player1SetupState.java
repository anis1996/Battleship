import java.awt.*;

public class Player1SetupState implements GameState {
    PlayerScreen player1;
    SelfGrid  sg;
    AttackGrid ag;

    BattleShip  bs;
	public void drawFrame(BattleShip bs)
	{
	    this.bs = bs;

		bs.setCurrentState(this);
		bs.setNextState(new Player2SetupState());

         sg = new SelfGrid(bs, "p1", true);
        ag = new AttackGrid(bs, "p1", false);
        player1 = new PlayerScreen("p1", true, bs, sg, ag);
    }

    public void validate()
    {
        sg = new SelfGrid(bs, "p1", true);
        ag = new AttackGrid(bs, "p1", false);

        player1.add(sg, BorderLayout.EAST );
        player1.add(ag, BorderLayout.WEST );
        player1.revalidate();
    }

    @Override
    public String toString(){
    	return "Player 1, Lay your ships!!!";
    }
}
