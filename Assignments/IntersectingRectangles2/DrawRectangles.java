import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class DrawRectangles extends JComponent {
	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;

		Rectangle r1t = new Rectangle();
		r1t.setRectangle();
		Rectangle r2t = new Rectangle();
		r2t.setRectangle(); 
		Rectangle r3t = Rectangle.Intersection(r1t, r2t);

		Rectangle2D.Double r1 = new Rectangle2D.Double(r1t.x, r1t.y, r1t.w, r1t.l);
		Rectangle2D.Double r2 = new Rectangle2D.Double(r2t.x, r2t.y, r2t.w, r2t.l);
		Rectangle2D.Double r3 = new Rectangle2D.Double(r3t.x, r3t.y, r3t.w, r3t.l);

		g2.draw(r1);
		g2.draw(r2);
		g2.draw(r3);
		g2.setColor(Color.GRAY);
		g2.fill(r3);
		
	}
}