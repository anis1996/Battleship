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
    protected JPanel getCell(int i ,int j , PlayerData pd, Boolean isClickable)
    {
        JPanel panel = new JPanel();
        if( pd.get(i, j) == 1)
        {
        	panel.setBackground(Color.white);
        }else
        {
        	panel.setBackground(Color.black);
        }
        panel.setBorder(BorderFactory.createLineBorder(Color.blue, 5));
        panel.setPreferredSize(new Dimension(20, 20)); // for demo purposes only
<<<<<<< HEAD
        panel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
               
                if(pd.shipscounter()<= 5)
            	{
            	if(i < 10 && j < 8)
            	{
            		pd.add(i, j);
            		panel.setBackground(Color.white);
            	}
            	}
=======
        if (isClickable) {
            panel.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
>>>>>>> 615fba6e51061d5c7e250e9561495bfa989c0238

                    if(pd.shipscounter()<= 5)
                    {
                     if(i < 8 && j < 8)
                     {
                      pd.add(i, j);
                      panel.setBackground(Color.white);
                  }
              }

          }
      }
  });
            return panel;
        }
    }