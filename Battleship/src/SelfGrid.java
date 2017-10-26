import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;

/**
 * Represents the player's own grid
*/
public class SelfGrid extends BattleGrid {
    public SelfGrid(String name, PlayerData pd) {
        super(pd);
    }

    @Override
    protected JPanel getCell(int i ,int j , PlayerData pd, boolean isClickable)
    {
        JPanel panel = new JPanel();
        if( pd.isHit(i, j))
        {
        	panel.setBackground(Color.white);
        }else
        {
        	panel.setBackground(Color.black);
        }
        panel.setBorder(BorderFactory.createLineBorder(Color.blue, 5));
        panel.setPreferredSize(new Dimension(20, 20)); // for demo purposes only
        if (isClickable) {
            panel.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {

                    if(pd.shipsCount()<= 5)
                    {
                     if(i < 8 && j < 8)
                     {
                      pd.addShip(i, j);
                      panel.setBackground(Color.white);
                  }
              }

          }
      });

        }

        return panel;
    }
  }
