import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;


public class PlayerScreen extends JFrame {

    public PlayerScreen(String name, boolean show, BattleShip bs, SelfGrid sg, AttackGrid ag) {
        super(name);
        this.setLayout(new BorderLayout());

        this.add(sg, BorderLayout.EAST);

        this.add(ag, BorderLayout.WEST);

        this.add(new JLabel(name), BorderLayout.NORTH);

        // next button in centre console
        JButton next = new JButton("next");
        next.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                hideScreen();
                bs.drawFrame();
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