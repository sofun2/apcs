import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import java.awt.event.*;

public class TicTacToe extends JComponent {

	private static int xdim = 600, ydim = 600, r = 3, c = 3, gameEnd = 0;
	public static Square [][] ss = new Square[r][c];

	
	TicTacToe(int aa, int ab, int ac, int ad) {
		xdim = aa;
		ydim = ab;
		r = ac;
		c = ad;
		for(int i = 0; i < r; i++) {
			for(int j = 0; j < c; j++) {
				ss[i][j] = new Square(i * ydim / r, j * xdim / c, ydim / r, xdim / c, "");
			}
		}
	}

	public void paintComponent(Graphics g) {

		Graphics2D g2 = (Graphics2D) g;

		// gridlines
		for(int i = xdim / c; i < xdim; i += xdim / c) {
			Line2D.Double line = new Line2D.Double(i, 0, i, ydim);
			g2.draw(line);
		}
		for(int i = ydim / r; i < ydim; i += ydim / r) {
			Line2D.Double line = new Line2D.Double(0, i, xdim, i);
			g2.draw(line);
		}

		// draw squares
		Font font = new Font("", Font.BOLD, Math.min(xdim / c / 4, ydim / r / 4));
		g2.setFont(font);
		for(int i = 0; i < r; i++) {
			for(int j = 0; j < c; j++) {
				g2.drawString(ss[i][j].s, ss[i][j].x + ss[i][j].xsz / 2, ss[i][j].y + ss[i][j].ysz / 2);
			}
		}

		if(gameEnd != 0) {
			String msg = "Player " + "_" + " won!";
			g2.drawString(msg, 0 + xdim / 10, (int)(1.1 * ydim));
		}

	}

	public void updateBoard() {
		repaint();
	}

	public static void main(String args[]) {
		JFrame frame = new JFrame();
		frame.setSize(xdim, (int)(1.25 * ydim));
		frame.setTitle("Tic Tac Toe");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		TicTacToe game = new TicTacToe(xdim, ydim, r, c); 
		frame.add(game);

		class MouseClick implements MouseListener {
			public void mousePressed(MouseEvent event) {};
			public void mouseReleased(MouseEvent event) {};
			public void mouseEntered(MouseEvent event) {};
			public void mouseClicked(MouseEvent event) {
				int mx = event.getX();
				int my = event.getY();
				boolean fl = false;
				for(int i = 0; i < r; i++) {
					if(fl) break;
					for(int j = 0; j < r; j++) {
						if(ss[i][j].x < mx && ss[i][j].x + ss[i][j].xsz > mx && ss[i][j].y < my && ss[i][j].y + ss[i][j].ysz > my) {
							ss[i][j].updateSquare();
							game.updateBoard();
							fl = true;
							break;
						}
					}
				}
			}
			public void mouseExited(MouseEvent event) {};
		}
	
		MouseListener mouse = new MouseClick();
		game.addMouseListener(mouse);

		frame.setVisible(true);
	}
}