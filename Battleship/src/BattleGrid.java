import javax.swing.*;
import java.awt.*;

/**
 * Class to represent grids
 */
public abstract class BattleGrid extends JPanel {
    public BattleGrid(BattleShip bs, String name, boolean click) {

            this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
            JPanel self = new JPanel();
            self.setLayout(new GridLayout(0, 10));
            //Creates a new Coordinate object and passes it to the getCell method to fill it
            //with the appropriate color
            for (int i = 0; i < 10; i++)
                for (int j = 0; j < 10; j++) {
                    self.add(getCell(bs, name, new Coordinate(j, i), click));
                }
            this.add(self);

    }
    /**
     * Returns a panel depending on what is in the current cell
     * @param bs is the BattleShip game
     * @param name is the name of the current player
     * @param c is the coordinate of the cell
     * @param isClickable Allows interaction with the cell during specific state
     * @return panel filled with a color describing what is in it
     */
    protected abstract JPanel getCell(BattleShip bs, String name,Coordinate c, boolean isClickable);
}