public class Player1SetupState implements GameState {

	public void drawFrame(BattleShip bs)
	{
		bs.setState(new Player2SetupState());
<<<<<<< HEAD
<<<<<<< HEAD
		AttackGrid ag = new AttackGrid("player1", bs.Player1);
		SelfGridSetup sgp = new SelfGridSetup("Player1", bs.Player1, bs, ag);
		
		PlayerScreen player1 = new PlayerScreen("Player1", true, bs, sgp, ag);
=======
		SelfGrid sgs = new SelfGrid("Player1", bs.Player1, false);
		AttackGrid ag = new AttackGrid("player1", bs.Player1);
		PlayerScreen player1 = new PlayerScreen("Player1", true, bs, sgs, ag);
>>>>>>> 1a1fa5ed7ff17ce745c4f86bb8b5d1bd2b836645
=======
		SelfGrid sg = new SelfGrid("Player1", bs.Player1);
		AttackGrid ag = new AttackGrid("player1", bs.Player1);
		PlayerScreen player1 = new PlayerScreen("Player1", true, bs, sg, ag);
>>>>>>> f64dba794cac85bf7d28f8eb7f384d8e9326d279
	}

    public void drawDefenseFrame(){}
}
