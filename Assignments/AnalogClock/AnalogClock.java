import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import java.awt.event.*;
import java.util.*;

public class AnalogClock extends JComponent {

	private int t;
	public AnalogClock(int tt) {
		tt = tt % 100 + (tt / 100) % 12 * 100;
		this.t = tt;
	}

	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		Ellipse2D.Double clockFace = new Ellipse2D.Double(0, 0, 500, 500);
		g2.setColor(Color.white);
		g2.fill(clockFace);
		g2.setColor(Color.black);
		int m = t % 100, h = t / 100;
		Line2D.Double minute = new Line2D.Double(250, 250, 250 + 200 * Math.cos(Math.PI / 2.0 - ((double)m / 60.0) * 2.0 * Math.PI), 500 - (200 * Math.sin(Math.PI / 2.0 - ((double)m / 60.0) * 2.0 * Math.PI) + 250) );
		g2.draw(minute);
		Line2D.Double hour = new Line2D.Double(250, 250, 250 + 150 * Math.cos(Math.PI / 2.0 - ((double)h / 12.0 + (double)m / 60.0 / 12.0) * 2.0 * Math.PI), 500 - (150 * Math.sin(Math.PI / 2.0 - ((double)h / 12.0 + (double)m / 60.0 / 12.0) * 2.0 * Math.PI) + 250) );
		g2.draw(hour);
	}

	public static void main(String args[]) {
		JFrame frame = new JFrame();
		frame.setSize(500, 530);
		frame.setTitle("AnalogClock");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Scanner in = new Scanner(System.in);
		System.out.print("Enter time: ");
		int tt = in.nextInt();

		AnalogClock myClock = new AnalogClock(tt); 
		frame.add(myClock);
		frame.setVisible(true);
	}
}