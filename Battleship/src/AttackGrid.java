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

    public AttackGrid(BattleShip bs, String name, boolean isClickable) {
        super(bs, name, isClickable);
    }
    @Override
    protected JPanel getCell(BattleShip bs, String name, Coordinate c, boolean isClickable)
    {
        PlayerData enemy = bs.getEnemyData(name);
        JPanel panel = new JPanel();
        //To redraw grid
        if(enemy.isShot(c)){
            if(!enemy.isHit(c)) {
                panel.setBackground(Color.BLUE);
            }
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
                        if(enemy.isThereShip(c)) {
                            panel.setBackground(Color.RED);
                        }
                        else{
                            panel.setBackground(Color.BLUE);
                            isClicked = false;
                        }
                        enemy.addShot(c);
                    }
                }
            });
        }
        return panel;
    }
}
