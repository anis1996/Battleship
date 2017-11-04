import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;

/**
 * Class to represent the grids for the game
 */
public class PlayerScreen extends JFrame {

    /**
     * @param name Name of the current player's turn
     * @param bs Is the BattleShip game
     * @param sg is the player's self grid
     * @param ag is the player's attack grid
     */
    public PlayerScreen(String name, BattleShip bs, SelfGrid sg, AttackGrid ag) {
        super(name);
        this.setLayout(new BorderLayout());

        this.add(sg, BorderLayout.EAST);

        this.add(ag, BorderLayout.WEST);

        this.add(new JLabel(name), BorderLayout.NORTH);

        // Creating and adding functionality to the next button in centre of the layout
        JButton next = new JButton("next");
        next.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                PlayerData pd  ;
                pd = (name == "p1")?  bs.player1: bs.player2;
                if(pd.shipsCount() >= 5  )
                {
                    hideScreen();
                    bs.drawFrame();
                }else
                     JOptionPane.showMessageDialog(PlayerScreen.this,
                            "Place 5 Ships Before Continue");
            }
        });

        this.add(next, BorderLayout.CENTER);

        JPanel southPanel = new JPanel();

        BoxLayout container = new BoxLayout(southPanel, BoxLayout.PAGE_AXIS);
        JPanel statsPane1 = new JPanel();
        JLabel missShots = new JLabel("Miss Shots(BLUE)");
        statsPane1.add(missShots);
        //Game Status -- top level of south panel
        JPanel statsPane = new JPanel();
        statsPane.setLayout(new GridLayout());
        //contents...
        int numShipsAlive = 5 - ((name == "p1") ? (bs.getData("p1").sunkCount()) : (bs.getData("p2").sunkCount()));
        int numShipsSunk = ((name == "p1") ? (bs.getData("p1").sunkCount()) : (bs.getData("p2").sunkCount()));
        int numEnemyShipSunk = ((name == "p1") ? (bs.getData("p2").sunkCount()) : (bs.getData("p1").sunkCount()));

        JLabel shipsAlive = new JLabel("Ships alive(ORANGE): "+ numShipsAlive); //add contents
        JLabel shipsSunk = new JLabel("Ships sunk(GREEN): " + numShipsSunk); //add contents
        JLabel enemyShipsSunk = new JLabel("Enemy ships sunk(RED CELL): " + numEnemyShipSunk); //add contents


        statsPane.add(shipsAlive); statsPane.add(shipsSunk); statsPane.add(enemyShipsSunk);

        southPanel.add(statsPane);
        southPanel.add(statsPane1);

        //Current State -- mid level of south panel
        JPanel statePane = new JPanel();
        statePane.setLayout(new GridLayout());
        //contents...
        JLabel stateLabel = new JLabel(bs.getCurrentState().toString());//add contents
        stateLabel.setHorizontalAlignment(JLabel.CENTER);
        statePane.add(stateLabel);
        southPanel.add(statePane);

        southPanel.setLayout(container);
        this.add(southPanel, BorderLayout.SOUTH);
        this.pack();
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }


    public void hideScreen() {
        this.setVisible(false);
    }
}