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

        JPanel southPanel = new JPanel();
        
        BoxLayout container = new BoxLayout(southPanel, BoxLayout.PAGE_AXIS);
        //Game Status -- top level of south panel
        JPanel statsPane = new JPanel();
        statsPane.setLayout(new GridLayout());
        //contents...
        int numShipsAlive = 5 - ((name == "Player1") ? (bs.Player1.sunkCount()) : (bs.Player2.sunkCount()));
        int numShipsSunk = ((name == "Player1") ? (bs.Player1.sunkCount()) : (bs.Player2.sunkCount()));
        int numEnemyShipSunk = ((name == "Player1") ? (bs.Player2.sunkCount()) : (bs.Player1.sunkCount()));

        JLabel shipsAlive = new JLabel("Ships alive: "+ numShipsAlive); //add contents
        JLabel shipsSunk = new JLabel("Ships sunk: " + numShipsSunk); //add contents
        JLabel enemyShipsSunk = new JLabel("Enemy ships sunk: " + numEnemyShipSunk); //add contents
        statsPane.add(shipsAlive); statsPane.add(shipsSunk); statsPane.add(enemyShipsSunk);
        southPanel.add(statsPane);

        //Current State -- mid level of south panel
        JPanel statePane = new JPanel();
        statePane.setLayout(new GridLayout());
        //contents...
        JLabel stateLabel = new JLabel(bs.getCurrentState().toString());//add contents
        stateLabel.setHorizontalAlignment(JLabel.CENTER);
        statePane.add(stateLabel);
        southPanel.add(statePane);
        
        //Game Over -- last level of south panel



        southPanel.setLayout(container);
        this.add(southPanel, BorderLayout.SOUTH);
        this.pack();
        this.setVisible(show);


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }


    public void hideScreen() {
        this.setVisible(false);
    }
}