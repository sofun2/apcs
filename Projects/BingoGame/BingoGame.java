import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import java.awt.event.*;
import java.util.*;

public class BingoGame extends JComponent {

	private final int sz = 5;
	private final int mx = 99;
	private int xdim, ydim = 500;
	private ArrayList<BingoBoard> players = new ArrayList<BingoBoard>();
	NextNumber n = new NextNumber(this.mx);
	private int nxt;
	private int won = 0;
	public HashSet<Integer> usedNumbers = new HashSet<>();
	private Random rand = new Random();

	public BingoGame() {
		// initialize players and generate board
		players.add(new BingoBoard(sz, mx, false));
		players.add(new BingoBoard(sz, mx, true));

		// set xdim
		System.out.println();
		xdim = 300 * players.size() + 50;
	}

	public int getNextNumber() {
		int tmp = 0;
		do {
			tmp = rand.nextInt(mx) + 1;
		} while(usedNumbers.contains(tmp));
		usedNumbers.add(tmp);
		return tmp;
	}

	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		for(int k = 0; k < players.size(); k++) {
			int xoffset = 50 + k * 300;
			BingoBoard p = players.get(k);
			g2.drawString((p.computerControlled ? "Computer" : "User"), xoffset, 30);
			for(int i = 0; i < p.sz; i++) {
				for(int j = 0; j < p.sz; j++) {
					if(p.marks[i][j]) {
						g2.setColor(Color.LIGHT_GRAY);
						g2.fillRect(xoffset + j * 50, 50 + i * 50, 50, 50);
					}
					g.setColor(Color.BLACK);
					g2.drawRect(xoffset + j * 50, 50 + i * 50, 50, 50);
					g2.drawString(Integer.toString(p.board[i][j]), xoffset + j * 50 + 25, 50 + i * 50 + 25);
				}
			}
			g2.drawString("Next Number: " + Integer.toString(nxt), xdim / 2 - 50, 350);
		}
		if(won == 1) {
			g2.drawString("Player Won", xdim / 2 - 50, 400);
		}
		if(won == 2) {
			g2.drawString("Computer Won", xdim / 2 - 50, 400);
		}
	}

	public void runGame() throws InterruptedException {
		while(true) {
			if(players.get(0).checkWin()) {
				won = 1;
				break;
			}
			if(players.get(1).checkWin()) {
				won = 2;
				break;
			}
			nxt = this.getNextNumber();
			players.get(1).computerMarkSquare(nxt);
			Thread.sleep(1000);
			repaint();
		}
	}

	public static void main(String args[]) throws InterruptedException {

		BingoGame game = new BingoGame();

		JFrame frame = new JFrame();
		frame.setSize(game.xdim, game.ydim);
		frame.setTitle("Bingo Game");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(game);
		frame.setVisible(true);

		class MouseClick implements MouseListener {
			public void mousePressed(MouseEvent event) {};
			public void mouseReleased(MouseEvent event) {};
			public void mouseEntered(MouseEvent event) {};
			public void mouseClicked(MouseEvent event) {
				int mx = event.getX();
				int my = event.getY();
				for(int i = 0; i < game.sz; i++) {
					for(int j = 0; j < game.sz; j++) {
						int bx = 50 + j * 50;
						int by = 50 + i * 50;
						if(mx > bx && mx < bx + 50 && my > by && my < by + 50) {
							int num = game.players.get(0).board[i][j];
							if(game.usedNumbers.contains(num)) {
								game.players.get(0).marks[i][j] = true;
								game.repaint();
							}
						}
					}
				}
			}
			public void mouseExited(MouseEvent event) {};
		}
	
		MouseListener mouse = new MouseClick();
		game.addMouseListener(mouse);

		game.runGame();		

	}

}