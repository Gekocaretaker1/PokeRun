package javag.pokerun.menu;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import javag.pokerun.PokeRunPanel;
import javag.pokerun.res.ImMage;

@SuppressWarnings("serial")
public class MainMenu extends JPanel {
	JButton playGameButton;
	JButton settingsMenuButton;
	
	public MainMenu() {
		this.setLayout(null);
		
		// Create the Play Game Button.
		playGameButton = new JButton("Play PokeRun!"/*, ImMage.PokeRunIcon*/);
		playGameButton.setText("Play PokeRun!");
		playGameButton.setBackground(new Color(50, 50, 50, 128));
		playGameButton.setHorizontalTextPosition(SwingConstants.CENTER);
		playGameButton.addActionListener(new PlayGameButtonListener());
		this.add(playGameButton);
		playGameButton.setBounds(100, 450, 150, 50);
		playGameButton.setContentAreaFilled(false);
		playGameButton.setBorderPainted(false);
	}
	
	private class PlayGameButtonListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			((PokeRunPanel) getParent()).switchToStartMenuFromMainMenu();
		}
	}
}
