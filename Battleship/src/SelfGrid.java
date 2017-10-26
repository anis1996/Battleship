import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;

/**
 * Represents the player's own grid
*/
public class SelfGrid extends BattleGrid {
    public SelfGrid(String name, PlayerData pd, boolean click) {
        super(pd, click);
    }

    @Override
    protected JPanel getCell(int x ,int y , PlayerData pd, boolean isClickable)
    {
        JPanel panel = new JPanel();
//        pd.grid[x][y] == 1
//
//
        // Color c;
        // c = (pd.isThereShip(x,y))? Color.white: Color.black;
        if( pd.isHit(x, y))
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

                    if(pd.shipsCount()< 5)
                    {
                     if(x < 8 && y < 10 && !pd.isThereShip(x,y))
                     {
                      pd.addShip(x, y);
                      panel.setBackground(Color.white);
                  }
              }

          }
      });

        }

        return panel;
    }
  }
