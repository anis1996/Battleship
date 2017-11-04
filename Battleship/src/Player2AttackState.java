/**
 * Class that represents the attacking stage for Player 2
 */
public class Player2AttackState implements GameState{

	@Override
	public void drawFrame(BattleShip bs)
	{
		bs.setCurrentState(this);

		if(bs.getData("p2").sunkCount() >= 5){
		  bs.setNextState(new GameOverState("p1"));
		  bs.drawFrame();
		 }
		else{
			bs.setNextState(new Player1AttackState());
			SelfGrid sg = new SelfGrid(bs, "p2", false);
			AttackGrid ag = new AttackGrid(bs, "p2", true);
			PlayerScreen player2 = new PlayerScreen("p2", bs, sg, ag);
		}
	}

	@Override
	public void validate() {}

	@Override
  	public String toString(){
    	return "Player 2 Attack on red grid(Left Side)!!!";
  	}
}
