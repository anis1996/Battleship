public class Player1SetupState implements GameState {

    private PlayerScreen ps;


    public Player1SetupState(PlayerScreen ps){
        this.ps = ps;
        ps.drawFrame();
    }

	public void drawFrame(BattleShip bs)
	{
		bs.setCurrentState(this);
		bs.setNextState(new Player2SetupState(ps));

        ps.addAttackGrid(new AttackGrid(bs, "p1", false));
        ps.addSelfGrid(new SelfGrid(bs, "p1", true));
        bs.screen.reDraw();
    }

    @Override
    public String toString(){
    	return "Player 1, Lay your ships!!!";
    }
}
