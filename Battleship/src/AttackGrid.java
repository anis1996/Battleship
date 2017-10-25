import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;

/**
 * Represents the players own grid
*/
public class AttackGrid extends BattleGrid {
    public AttackGrid(String name, PlayerData player1) {
        super(player1);

    }

    @Override
    protected JPanel getCell(int i, int j, PlayerData pd, boolean isClickable)
    {
        JPanel panel = new JPanel();
        panel.setBackground(Color.white);

        
        panel.setBorder(BorderFactory.createLineBorder(Color.red, 5));
        panel.setPreferredSize(new Dimension(20, 20)); // for demo purposes only

        return panel;
    }
}