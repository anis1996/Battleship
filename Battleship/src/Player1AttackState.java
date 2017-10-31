public class Player1AttackState implements GameState{

	public void drawFrame(BattleShip bs)
	{
        SelfGrid sg ;
        AttackGrid ag;
        bs.setCurrentState(this);
        if(bs.getData("p2").sunkCount() >= 5){
            bs.setNextState(new GameOverState("p1"));
            bs.drawFrame();
        }


        else{
          bs.setNextState(new Player2AttackState());
          sg = new SelfGrid(bs, "p1", false);
          ag = new AttackGrid(bs, "p1", true);
          PlayerScreen player1 = new PlayerScreen("p1", true, bs, sg,ag);
      }
  }

  @Override
  public String toString(){
      return "Player 1 Attack!!!";
  }

}
