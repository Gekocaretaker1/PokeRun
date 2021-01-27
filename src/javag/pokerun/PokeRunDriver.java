package javag.pokerun;

import java.awt.Dimension;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.swing.JFrame;

import javag.pokerun.res.ImMage;

public class PokeRunDriver {
	private static JFrame frame;
	private static PokeRunPanel pokeRunPanel = new PokeRunPanel();
	private static String OS = System.getProperty("os.name").toLowerCase();
	
	public static void main(String[] args) {
		
		if(isWindows()) {
			String dataString = System.getProperty("user.home") + "/pokerun";
			Path dataPath = Paths.get(dataString);
			
			if(!Files.exists(dataPath)) {
				try {
					Files.createDirectory(dataPath);
				} catch (IOException e) {
					e.printStackTrace();
				}
//				dataString += "/data";
//				dataPath = Paths.get(dataString);
//				try {
//					Files.createDirectory(dataPath);
//					Files.setAttribute(dataPath, "dos:hidden", true);
//				} catch (IOException e) {
//					e.printStackTrace();
//				}
				dataString = System.getProperty("user.home") + "/pokerun/customization";
				dataPath = Paths.get(dataString);
				try {
					Files.createDirectory(dataPath);
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		} else {
			String dataString = System.getProperty("user.home") + "/pokerun";
			Path dataPath = Paths.get(dataString);
			
			if(!Files.exists(dataPath)) {
				try {
					Files.createDirectory(dataPath);
				} catch (IOException e) {
					e.printStackTrace();
				}
//				dataString += "/.data";
//				dataPath = Paths.get(dataString);
//				try {
//					Files.createDirectory(dataPath);
//					Files.setAttribute(dataPath, "dos:hidden", true);
//				} catch (IOException e) {
//					e.printStackTrace();
//				}
				dataString = System.getProperty("user.home") + "/pokerun/customization";
				dataPath = Paths.get(dataString);
				try {
					Files.createDirectory(dataPath);
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		frame = new JFrame("PokeRun!");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//frame.setIconImage();
		frame.setMaximumSize(new Dimension(800, 600));
		frame.setPreferredSize(new Dimension(800, 600));
		frame.setResizable(false);
		frame.add(pokeRunPanel);
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
	
	public static boolean isWindows() {
        return (OS.indexOf("win") >= 0);
    }

    public static boolean isMac() {
        return (OS.indexOf("mac") >= 0);
    }

    public static boolean isUnix() {
        return (OS.indexOf("nix") >= 0
                || OS.indexOf("nux") >= 0
                || OS.indexOf("aix") > 0);
    }

    public static boolean isSolaris() {
        return (OS.indexOf("sunos") >= 0);
    }
}
