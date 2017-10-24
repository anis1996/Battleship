import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;

/**
 * Represents the player's own grid
*/
public class SelfGrid extends BattleGrid {
    public SelfGrid(String name, BattleShip bs) {
        super(bs);
    }

    @Override
    protected JPanel getCell(int i ,int j , BattleShip bs)
    {
        JPanel panel = new JPanel();
        panel.setBackground(Color.black);
        panel.setBorder(BorderFactory.createLineBorder(Color.blue, 5));
        panel.setPreferredSize(new Dimension(20, 20)); // for demo purposes only
        panel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                
                System.out.println("Check");
                if(bs.Player1.shipscounter()<= 5)
            	{
                	System.out.println("Check2");
            	panel.setBackground(Color.white);
            	bs.Player1.add(i, j);
            	}

            }
        });
        return panel;
    }
}