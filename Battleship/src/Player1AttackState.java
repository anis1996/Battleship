/**
 * Class that represents the attacking stage for Player 1
 */
public class Player1AttackState implements GameState{
    @Override
	public void drawFrame(BattleShip bs)
	{
        bs.setCurrentState(this);
        //Checks if Player 1 has at least 5 ships sunk, if true, goes to GameOverState, else continues to Player 2 attack state
        if(bs.getData("p1").sunkCount() >= 5){
            bs.setNextState(new GameOverState("p2"));
            bs.drawFrame();
        }
        else{
          bs.setNextState(new Player2AttackState());
          SelfGrid sg = new SelfGrid(bs, "p1", false);
          AttackGrid ag = new AttackGrid(bs, "p1", true);
          PlayerScreen player1 = new PlayerScreen("p1", bs, sg,ag);
      }

  }
    @Override
    public void validate()
    {}


    @Override
    public String toString(){
      return "Player 1 Attack on Red Grid(Left side)!!!";
  }

}
