import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;

/**
 * Represents the players own grid
*/
public class AttackGrid extends BattleGrid {
	boolean getClicked = true;
    public AttackGrid(String name, PlayerData player1, boolean click) {
        super(player1, click);

    }

    @Override
    protected JPanel getCell(int x, int y, PlayerData pd, boolean isClickable)
    {

        JPanel panel = new JPanel();
        // if( pd.grid[x][y] == 2)
        // {
        // 	panel.setBackground(Color.red);
        // }else if(pd.grid[x][y]==3)
        // {
        // 	panel.setBackground(Color.blue);
        // }
        // else
        // {
        // 	panel.setBackground(Color.white);
        // }

        panel.setBorder(BorderFactory.createLineBorder(Color.red, 5));
        panel.setPreferredSize(new Dimension(20, 20)); // for demo purposes only
        if(isClickable)
        {
        panel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                if(getClicked)
                {
                	// if(pd.grid[x][y] == 1)
                	// {
                	// panel.setBackground(Color.red);
                	// pd.grid[x][y] = 2;
                	// }else
                	// {
                	// 	panel.setBackground(Color.blue);
                	// 	pd.grid[x][y] = 3;
                	// }

                	// getClicked = false;

                }


          }


  });
        }
        return panel;
    }
}