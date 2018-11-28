import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class Box extends JComponent {

	private int x, y;

	public void updateLocation(int xx, int yy) {
		this.x = xx;
		this.y = yy;
		repaint();
	}

	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		Rectangle rect = new Rectangle(x, y, 100, 100);
		g2.draw(rect);
	}
}