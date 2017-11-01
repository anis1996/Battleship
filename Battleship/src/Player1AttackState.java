public class Player1AttackState implements GameState{

  private PlayerScreen ps;

  public Player1AttackState(PlayerScreen ps){
    this.ps = ps;
  }

  public void drawFrame(BattleShip bs)
  {
    SelfGrid sg ;
    AttackGrid ag;

    bs.setCurrentState(this);

    if(bs.getData("p2").sunkCount() >= 5){
      bs.setNextState(new GameOverState(ps, "p1"));
      // bs.drawFrame();
    }
    else{
      bs.setNextState(new Player2AttackState(ps));
      // sg = new SelfGrid(bs, "p1", false);
      // ag = new AttackGrid(bs, "p1", true);
      ps.addAttackGrid(new AttackGrid(bs, "p1", true));
      ps.addSelfGrid(new SelfGrid(bs, "p1", false));
      // PlayerScreen player1 = new PlayerScreen("p1", true, bs, sg,ag);
    }
    ps.reDraw();
  }

  @Override
  public String toString(){
    return "Player 1 Attack!!!";
  }

}
