import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;

/**
 * Represents the player's own grid
*/
public class SelfGrid extends BattleGrid {
    public SelfGrid(String name, BattleShip bt) {
        super(bt);
    }

    @Override
    protected JPanel getCell(int i ,int j , BattleShip bt)
    {
        JPanel panel = new JPanel();
        panel.setBackground(Color.black);
        panel.setBorder(BorderFactory.createLineBorder(Color.blue, 5));
        panel.setPreferredSize(new Dimension(20, 20)); // for demo purposes only
        panel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                panel.setBackground(Color.white);
                if(bt.Player1.ships.size() <= 5)
            	{
            	panel.setBackground(Color.white);
            	bt.Player1.add(i, j);
            	}
                
            }
        });
        return panel;
    }
}