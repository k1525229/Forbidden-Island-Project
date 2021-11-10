//here is the frame that we will use

import java.awt.Image;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
public class ForbiddenIslandFrame extends JFrame{
	public static final int WIDTH = 1200;
	public static final int HEIGHT = 480;
	private Image icon;
	public ForbiddenIslandFrame(String title){
		super(title);
		try {
			icon = ImageIO.read(getClass().getResource("/Images/icon.png"));
		}
		catch(Exception e) {
			System.out.println("Image icon not found.");
		}
		setIconImage(icon);
		icon = icon.getScaledInstance(800, 800, Image.SCALE_SMOOTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}
