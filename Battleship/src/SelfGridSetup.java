import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BorderFactory;
import javax.swing.JPanel;


public class SelfGridSetup extends SelfGrid {
	BattleShip bs;
	AttackGrid ag;
	SelfGridSetup sgs = this;
	public SelfGridSetup(String name, PlayerData pd, BattleShip bs, AttackGrid ag)
	{
		super(name,pd);
		this.bs = bs;
		this.ag = ag;

	}
	
	public void createNewScreen()
	{
		PlayerScreen player1 = new PlayerScreen("Player1", true, bs, sgs , ag);
	}

	    @Override
	    protected JPanel getCell(int i ,int j, PlayerData pd)
	    {
	    	
	        JPanel panel = new JPanel();
	        
	        if( pd.get(i, j) == 1)
	        {
	        	panel.setBackground(Color.white);
	        }else 
	        {
	        	panel.setBackground(Color.black);
	        }
	        panel.setBorder(BorderFactory.createLineBorder(Color.blue, 5));
	        panel.setPreferredSize(new Dimension(20, 20)); // for demo purposes only
	        panel.addMouseListener(new MouseAdapter() {
	            @Override
	            public void mouseClicked(MouseEvent e) {
	            	
	             	if(i < 10 && j < 8 && pd.shipscounter()<5)
	             	{
	             		pd.add(i, j);
//	             		panel.setBackground(Color.white);
	             		createNewScreen();
	             	
	             	}

	            }
	        });
	        return panel;
	    }

		
}
