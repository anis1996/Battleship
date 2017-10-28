import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;

/**
 * Represents the player's own grid
*/
public class SelfGrid extends BattleGrid {
    public SelfGrid(String name, PlayerData pd, boolean isClickable) {
        super(pd, isClickable);
    }

    @Override
    protected JPanel getCell(Coordinate c, PlayerData pd, boolean isClickable)
    {
        JPanel panel = new JPanel();

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
                      }
                  }

              }
          });

        }
        return panel;
    }
}
