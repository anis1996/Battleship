public class Player2AttackState implements GameState{
	public void drawFrame(BattleShip bs)
	{
		SelfGrid sg;
		AttackGrid ag;
		// if(bs.Player2.PlayerStatus())
  //       {
		// 	bs.setState(new GameOverState());
		// 	sg = new SelfGrid("Player1", bs.Player2,true);
		// 	ag = new AttackGrid("player1", bs.Player1, false);
  //       }
		// else
		// {
	if(bs.Player1.sunkCount() >= 1){
      bs.setState(new GameOverState());
      sg = new SelfGrid("Player2", bs.Player1, true);
      ag = new AttackGrid("Player2", bs.Player2, false);
     }
		bs.setState(new Player1AttackState());
		sg = new SelfGrid("Player1", bs.Player2,false);
		ag = new AttackGrid("Player1", bs.Player1, true);
		// }
		PlayerScreen player2 = new PlayerScreen("Player2", true,bs, sg, ag);
	}
}
