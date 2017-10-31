public class Player1SetupState implements GameState {

	public void drawFrame(BattleShip bs)
	{
		bs.setCurrentState(this);
		bs.setNextState(new Player2SetupState());

        SelfGrid  sg = new SelfGrid(bs, "p1", true);
        AttackGrid ag = new AttackGrid(bs, "p1", false);
        PlayerScreen player1 = new PlayerScreen("p1", true, bs, sg, ag);
    }

    @Override
    public String toString(){
    	return "Player 1, Lay your ships!!!";
    }
}
