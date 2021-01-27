package javag.pokerun;

import java.awt.CardLayout;

import javax.swing.JPanel;

import javag.pokerun.menu.MainMenu;
import javag.pokerun.menu.StartRegionMenu;

@SuppressWarnings("serial")
public class PokeRunPanel extends JPanel {
	public PokeRunPanel() {
		
		this.setLayout(new CardLayout());
		MainMenu mainMenu = new MainMenu();
		StartRegionMenu startRegionMenu = new StartRegionMenu();
		this.add(mainMenu, "MainMenu");
		this.add(startRegionMenu, "StartRegionMenu");
	}
	
	public void switchToStartMenuFromMainMenu() {
		CardLayout cl = (CardLayout)(this.getLayout());
		cl.show(this, "StartRegionMenu");
	}
}
