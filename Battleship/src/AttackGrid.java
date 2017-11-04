import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * This class represents the grid for a player to attack opponents ships
 * A new AttackGrid object is made during every change in state
 */
public class AttackGrid extends BattleGrid {
	private boolean isClicked = true; //Allows interaction with the grid, after a shot is taken and missed

    /**
     * @param bs is the BattleShip game
     * @param name is the name of the current player
     * @param isClickable allows interaction with the grid during attack state
     */
    public AttackGrid(BattleShip bs, String name, boolean isClickable) {
        super(bs, name, isClickable);
    }

    @Override
    protected JPanel getCell(BattleShip bs, String name, Coordinate c, boolean isClickable)
    {
        //Creates a reference to opponent
        PlayerData enemy = bs.getEnemyData(name);
        JPanel panel = new JPanel();

        //To fill each cell with appropriate color
        if(enemy.isShot(c)){
            if(!enemy.isHit(c))panel.setBackground(Color.BLUE); //Shot but missed cell
            else panel.setBackground(Color.RED); //Shot and hit cell
        } else
            panel.setBackground(Color.WHITE);//default
        panel.setBorder(BorderFactory.createLineBorder(Color.red, 2));
        panel.setPreferredSize(new Dimension(30, 30)); // for demo purposes only
        if(isClickable)
        {
            panel.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    //when cell is clicked
                    if(isClicked)
                    {
                        if(enemy.isHit(c)) {
                            panel.setBackground(Color.RED);
                        }
                        else{
                            panel.setBackground(Color.BLUE);
                            isClicked = false; //prevents cell from being clicked again
                        }
                        enemy.addShot(c); //adds the cell to the list of shots pin enemy's list
                    }
                }
            });
        }
        return panel;
    }
}
