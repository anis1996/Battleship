import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;

/**
 * Represents the players own grid
*/
public class AttackGrid extends BattleGrid {
	private boolean isClicked = true;
    public AttackGrid(String name, PlayerData player, boolean isClickable) {
        super(player, isClickable);

    }

    @Override
    protected JPanel getCell(Coordinate c, PlayerData pd, boolean isClickable)
    {

        JPanel panel = new JPanel();
        //To redraw grid
        if(pd.isShot(c)){
            if(!pd.isHit(c))
                panel.setBackground(Color.BLUE);
            else
                panel.setBackground(Color.RED);
        }
        else
            panel.setBackground(Color.WHITE);



        panel.setBorder(BorderFactory.createLineBorder(Color.red, 5));
        panel.setPreferredSize(new Dimension(20, 20)); // for demo purposes only
        if(isClickable)
        {
            panel.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    //when cell is clicked
                    if(isClicked)
                    {
                        if(pd.isThereShip(c))
                            panel.setBackground(Color.RED);
                        else{
                            panel.setBackground(Color.BLUE);
                            isClicked = false;
                        }
                        pd.addShot(c);
                    }
                }
            });
        }
        return panel;
    }
}
