
public class BattleShip {
    public static void main(String[] args) {

        PlayerScreen player1 = new PlayerScreen("Player1", true);
        GameState state = new Player1SetupState();
        //PlayerScreen player2 = new PlayerScreen("Player2", false);
        state = new Player2SetupState();

    }
}