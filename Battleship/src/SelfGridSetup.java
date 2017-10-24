import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BorderFactory;
import javax.swing.JPanel;


public class SelfGridSetup extends BattleGrid {
	public SelfGridSetup(String name, BattleShip bs)
	{
		super(bs);

	}

	    @Override
	    protected JPanel getCell(int i ,int j, BattleShip bs)
	    {
	        JPanel panel = new JPanel();
	        panel.setBackground(Color.black);
	        panel.setBorder(BorderFactory.createLineBorder(Color.blue, 5));
	        panel.setPreferredSize(new Dimension(20, 20)); // for demo purposes only
	        panel.addMouseListener(new MouseAdapter() {
	            @Override
	            public void mouseClicked(MouseEvent e) {

	            }
	        });
	        return panel;
	    }
}
