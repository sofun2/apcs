import javax.swing.*;

public class MyFrame {
	public static void main(String args[]) {
		JFrame frame = new JFrame();
		frame.setSize(300, 400);
		frame.setTitle("Nani");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Face face = new Face(); // JComponent object
		frame.add(face);
		frame.setVisible(true);
	}
}