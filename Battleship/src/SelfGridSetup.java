import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BorderFactory;
import javax.swing.JPanel;


public class SelfGridSetup extends SelfGrid {
	public SelfGridSetup(String name, PlayerData pd)
	{
		super(name,pd);

	}

	    @Override
	    protected JPanel getCell(int i ,int j, PlayerData pd)
	    {
	        JPanel panel = new JPanel();
	        panel.setBackground(Color.black);
	        panel.setBorder(BorderFactory.createLineBorder(Color.blue, 5));
	        panel.setPreferredSize(new Dimension(20, 20)); // for demo purposes only
	        panel.addMouseListener(new MouseAdapter() {
	            @Override
	            public void mouseClicked(MouseEvent e) {
	            	 if(pd.shipscounter()<= 5)
	             	{
	             	if(i < 8 && j < 8)
	             	{
	             		pd.add(i, j);
	             		panel.setBackground(Color.white);
	             	}
	             	}

	            }
	        });
	        return panel;
	    }

		
}
