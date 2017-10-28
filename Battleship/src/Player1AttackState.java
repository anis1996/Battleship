public class Player1AttackState implements GameState{

	public void drawFrame(BattleShip bs)
	{
		 SelfGrid sg ;
		 AttackGrid ag;
     bs.setCurrentState(this);
     if(bs.Player2.sunkCount() >= 5){
      bs.setNextState(new GameOverState("Player 1"));
      bs.drawFrame();
     }
      
     
    else{
      bs.setNextState(new Player2AttackState());
      sg = new SelfGrid("Player1", bs.Player1, false);
   		ag = new AttackGrid("player1", bs.Player2, true);
      PlayerScreen player1 = new PlayerScreen("Player1", true, bs, sg,ag);
    }	
	}

    @Override
    public String toString(){
      return "Player 1 Attack!!!";
   }

}
