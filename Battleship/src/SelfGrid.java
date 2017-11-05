import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Represents the player's own grid
*/
public class SelfGrid extends BattleGrid {
    public SelfGrid(BattleShip bs, String name, boolean isClickable) {
        super(bs, name, isClickable);
    }

    @Override
    protected JPanel getCell(BattleShip bs, String name, Coordinate c, boolean isClickable)
    {
        JPanel panel = new JPanel();
        PlayerData pd = bs.getData(name);

        //Redraws cells in SelfGrid appropriately depending on contents
        if( pd.isHit(c)) {
            if (pd.isShot(c))
                panel.setBackground(Color.GREEN);
            else
                panel.setBackground(Color.ORANGE);
        }
        else
        	panel.setBackground(Color.black);


        panel.setBorder(BorderFactory.createLineBorder(Color.blue, 2));
        panel.setPreferredSize(new Dimension(30, 30));

        //Is used for setting up phase, adds ship and reValidates
        if (isClickable) {
            panel.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    if(pd.shipsCount() < 5)
                    {
                       if(c.getX() < 8 && c.getY() < 10 && !pd.isHit(c) && pd.canIPutShipHere(c))
                       {
                          pd.addShip(c);
                          bs.reDrawFrame();
                      }
                  }

              }
          });
        }
        return panel;
    }
}
