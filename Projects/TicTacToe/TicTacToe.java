/**
 * Write a description of class TicTacToe2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import java.awt.event.*;

public class TicTacToe extends JComponent
{
    private int x, y;
    private int moves = 0;

	public void updateLocation(int xx, int yy) {
		this.x = xx;
		this.y = yy;
		repaint();
	}

	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		Line2D.Double line1 = new Line2D.Double(200, 0, 200, 600);
		g2.draw(line1);
		Line2D.Double line2 = new Line2D.Double(400, 0, 400, 600);
		g2.draw(line2);
		Line2D.Double line3 = new Line2D.Double(0, 200, 600, 200);
		g2.draw(line3);
		Line2D.Double line4 = new Line2D.Double(0, 400, 600, 400);
		g2.draw(line4);	
	}
	
    public static void main(String args[]) {
		JFrame frame = new JFrame();
		frame.setSize(600, 600);
		frame.setTitle("Board");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		TicTacToe game = new TicTacToe(); // JComponent object

		class MouseClick implements MouseListener {
			public void mousePressed(MouseEvent event) {};
			public void mouseReleased(MouseEvent event) {};
			public void mouseEntered(MouseEvent event) {};
			public void mouseClicked(MouseEvent event) {
				int x = event.getX();
				int y = event.getY();
				game.updateLocation(x, y);
			}
			public void mouseExited(MouseEvent event) {};
		}
		
		MouseListener mouse = new MouseClick();
		game.addMouseListener(mouse);

		frame.add(game);
		frame.setVisible(true);
	}
}
