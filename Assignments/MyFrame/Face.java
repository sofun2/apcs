import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class Face extends JComponent {
	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		Ellipse2D.Double head = new Ellipse2D.Double(5, 10, 100, 150);
		g2.draw(head);

		Line2D.Double eye1 = new Line2D.Double(25, 70, 45, 90);
		g2.draw(eye1);

		Line2D.Double eye2 = new Line2D.Double(85, 70, 65, 90);
		g2.draw(eye2);

		Rectangle2D.Double mouth = new Rectangle2D.Double(30, 130, 50, 5);
		g2.setColor(Color.RED);
		g2.fill(mouth);
		g2.draw(mouth);

		g2.setColor(Color.BLACK);
		g2.drawString("UwU", 5, 175);
	}
}