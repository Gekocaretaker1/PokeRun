package javag.pokerun.res;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

import javag.pokerun.PokeRunDriver;

/**
 * This Image Mage, or ImMage, contains Methods and Icons that can be used for graphics for PokeRun! games.
 * @author Gekocaretaker
 *
 */
public class ImMage {
	public static ImageIcon PokeRunIcon = createImMageFromImage(181, 240, PokeRunDriver.class.getResource("res/tree_icon_2.png"));
	public static ImageIcon TestIcon = createImMageFromColor(60, 60, 0, 0, 128);
	
	/**
	 * Create a graphics from a color. Use this as a graphics place holder.
	 * @param width Used for the width of the image
	 * @param height Used for the height of the image
	 * @param r The red value of the image
	 * @param g The green value of the image
	 * @param b The blue value of the image
	 * @return A ImageIcon
	 */
	public static ImageIcon createImMageFromColor(int width, int height, int r, int g, int b) {
		BufferedImage image = new BufferedImage(60, 60, BufferedImage.TYPE_INT_ARGB);
		Graphics2D graphics = image.createGraphics();
		
		graphics.setPaint(new Color(r, g, b));
		graphics.fillRect(0, 0, image.getWidth(), image.getHeight());
		
		ImageIcon imageIcon = new ImageIcon(image);
		return imageIcon;
	}
	
	/**
	 * Create a graphics from a color with an alpha. Use this as a graphics place holder.
	 * @param width Used for the width of the image
	 * @param height Used for the height of the image
	 * @param r The red value of the image
	 * @param g The green value of the image
	 * @param b The blue value of the image
	 * @param a The alpha value of the image
	 * @return A ImageIcon
	 */
	public static ImageIcon createImMageFromColor(int width, int height, int r, int g, int b, int a) {
		BufferedImage image = new BufferedImage(60, 60, BufferedImage.TYPE_INT_ARGB);
		Graphics2D graphics = image.createGraphics();
		
		graphics.setPaint(new Color(r, g, b, a));
		graphics.fillRect(0, 0, image.getWidth(), image.getHeight());
		
		ImageIcon imageIcon = new ImageIcon(image);
		return imageIcon;
	}
	
	/**
	 * Create a graphics from a image. Use this as a graphics placeholder, or as a texture.
	 * @param width The width of the graphics
	 * @param height The height of the graphics
	 * @param src The src of the image. Do NOT use a direct link, as this will break your code when sharing. Instead use something like this: `< DriverClass >.class.getResource("< folder/path/that/your/image/is/in.png >")` and make the folder path start from the driver class folder.
	 * @return A ImageIcon
	 */
	public static ImageIcon createImMageFromImage(int width, int height, URL src) {
		BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
		Graphics2D graphics = image.createGraphics();
		
		Image stringToImage = null;
		try {
			stringToImage = ImageIO.read(src);
		} catch (IOException e) {
			System.out.println("URL is not correct. Did you look at the createImMageFromImage() documentation?");
			e.printStackTrace();
		}
		
		graphics.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
		graphics.drawImage(stringToImage, 0, 0, width, height, null);
		
		ImageIcon icon = new ImageIcon(image);
		
		return icon;
	}
}
