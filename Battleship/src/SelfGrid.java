import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;

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

        if( pd.isThereShip(c))
        	panel.setBackground(Color.white);
        else
        	panel.setBackground(Color.black);

        panel.setBorder(BorderFactory.createLineBorder(Color.blue, 5));
        panel.setPreferredSize(new Dimension(20, 20));
        if (isClickable) {
            panel.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {

                    if(pd.shipsCount() < 5)
                    {
                       if(c.getX() < 8 && c.getY() < 10 && !pd.isThereShip(c))
                       {
                          pd.addShip(c);
                          panel.setBackground(Color.white);
                          bs.reDrawFrame();
                      }
                  }

              }
          });

        }
        return panel;
    }
}
