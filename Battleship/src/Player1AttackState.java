public class Player1AttackState implements GameState{

	public void drawFrame(BattleShip bs)
	{
		 SelfGrid sg ;
		 AttackGrid ag;
     bs.setCurrentState(this);
		 // if(bs.Player2.PlayerStatus())
   //       {
   //       	bs.setState(new GameOverState());
   //       	 sg = new SelfGrid("Player1", bs.Player1, true);
   //  		 ag = new AttackGrid("player1", bs.Player2, false);
   //       }else
   //       {
     if(bs.Player2.sunkCount() >= 1){
      bs.setNextState(new GameOverState());
      bs.drawFrame();
     }
      
     
    else{
      bs.setNextState(new Player2AttackState());
      sg = new SelfGrid("Player1", bs.Player1, false);
   		ag = new AttackGrid("player1", bs.Player2, true);
      PlayerScreen player1 = new PlayerScreen("Player1", true, bs, sg,ag);
    }

		
	}
}
