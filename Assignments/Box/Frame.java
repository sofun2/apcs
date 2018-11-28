import javax.swing.*;
import java.awt.event.*;

public class Frame {
	public static void main(String args[]) {
		JFrame frame = new JFrame();
		frame.setSize(1000, 1000);
		frame.setTitle("Box");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Box myBox = new Box(); // JComponent object

		class MouseClick implements MouseListener {
			public void mousePressed(MouseEvent event) {};
			public void mouseReleased(MouseEvent event) {};
			public void mouseEntered(MouseEvent event) {};
			public void mouseClicked(MouseEvent event) {
				int x = event.getX();
				int y = event.getY();
				myBox.updateLocation(x, y);
			}
			public void mouseExited(MouseEvent event) {};
		}

		MouseListener mouse = new MouseClick();
		myBox.addMouseListener(mouse);

		frame.add(myBox);
		frame.setVisible(true);
	}
}