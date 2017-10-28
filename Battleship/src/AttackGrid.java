import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;

/**
 * Represents the players own grid
*/
public class AttackGrid extends BattleGrid {
	private boolean getClicked = true;
    public AttackGrid(String name, PlayerData player, boolean click) {
        super(player, click);

    }

    @Override
    protected JPanel getCell(Coordinate c, PlayerData pd, boolean isClickable)
    {

        JPanel panel = new JPanel();
        // 1 == no ship
        // 2 == hit ship
        // 3 == hit 
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
        if(pd.isShot(c))
            panel.setBackground(Color.RED);
        else
            panel.setBackground(Color.WHITE);



        panel.setBorder(BorderFactory.createLineBorder(Color.red, 5));
        panel.setPreferredSize(new Dimension(20, 20)); // for demo purposes only
        if(isClickable)
        {
            panel.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {

                    if(getClicked)
                    {
                        getClicked = false;
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
                        if(pd.isThereShip(c)){
                            panel.setBackground(Color.RED);
                            pd.addShot(c);
                        }
                        else
                            panel.setBackground(Color.BLUE);
                    }
                }
            });
        }
        return panel;
    }
}