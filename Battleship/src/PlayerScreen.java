import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;

//TODO The grids need to handle the clicks.
//The attack grid should check the opponents ship positions
//(Beware: breaking encapsulation is not permissible.
//Think about how you can enhance the attackgridplayerscreen class to do this).
public class PlayerScreen extends JFrame {
    public PlayerScreen(String name, boolean show, BattleShip bt) {
        super(name);
        this.setLayout(new BorderLayout());

        
        this.add(new SelfGrid(name), BorderLayout.EAST);
        this.add(new AttackGrid(name), BorderLayout.WEST);
        this.add(new JLabel(name), BorderLayout.NORTH);
        JButton next = new JButton("next");
        next.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                hideScreen();
                bt.drawFrame();
            }
        });
        this.add(next, BorderLayout.CENTER);
        this.pack();
        this.setVisible(show);
        
       
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
    }

    public void hideScreen() {
        this.setVisible(false);
    }
}