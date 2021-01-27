package javag.pokerun.menu;

import javax.swing.JButton;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class StartRegionMenu extends JPanel {
	public StartRegionMenu() {
		this.setLayout(null);
		
		JButton kantoButton = new JButton("Kanto Region");
		this.add(kantoButton);
		kantoButton.setBounds(100, 450, 150, 50);
		kantoButton.setContentAreaFilled(false);
		kantoButton.setBorderPainted(false);
	}
}
