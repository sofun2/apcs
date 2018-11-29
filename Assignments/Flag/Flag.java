import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import java.awt.event.*;

public class Flag extends JComponent {

	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		
		g2.setColor(Color.blue);
		int x1[] = {0, 0, 190};
		int y1[] = {290, 0, 0};
		g2.fillPolygon(x1, y1, 3);

		g2.setColor(Color.yellow);
		int x2[] = {0, 190, 390};
		int y2[] = {290, 0, 0};
		g2.fillPolygon(x2, y2, 3);
		
		g2.setColor(Color.red);
		int x3[] = {0, 390, 580, 580};
		int y3[] = {290, 0, 0, 90};
		g2.fillPolygon(x3, y3, 4);

		g2.setColor(Color.white);
		int x4[] = {0, 580, 580};
		int y4[] = {290, 90, 190};
		g2.fillPolygon(x4, y4, 3);

		g2.setColor(Color.green);
		int x5[] = {0, 580, 580};
		int y5[] = {290, 190, 290};
		g2.fillPolygon(x5, y5, 3);
	}

	public static void main(String args[]) {
		JFrame frame = new JFrame();
		frame.setSize(700, 700);
		frame.setTitle("Flag of Seychelles");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Flag myFlag = new Flag(); // JComponent object

		frame.add(myFlag);
		frame.setVisible(true);
	}
}