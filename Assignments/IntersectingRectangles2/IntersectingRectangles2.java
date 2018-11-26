import javax.swing.*;

public class IntersectingRectangles2 {
	public static void main(String args[]) {
		DrawRectangles rec = new DrawRectangles(); // JComponent object
		JFrame frame = new JFrame();
		frame.setSize(1000, 1000);
		frame.setTitle("Intersecting Rectangles");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(rec);
		frame.setVisible(true);
	}
}