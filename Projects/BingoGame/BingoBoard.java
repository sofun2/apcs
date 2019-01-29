import java.util.*;

public class BingoBoard{

	public int sz = 5, mx = 99;
	public boolean computerControlled = true;
	public int[][] board;
	public boolean[][] marks;

	public BingoBoard(int a, int b, boolean c) {

		// initialize board dimensions
		this.sz = a;
		this.mx = b;
		computerControlled = c;

		// set marks to false;
		this.marks = new boolean[sz][sz];
		for(int i = 0; i < sz; i++) {
			for(int j = 0; j < sz; j++) {
				this.marks[i][j] = false;
			}
		}

		// generate boards
		this.board = this.generateBoard();
	}

	public int[][] generateBoard() {
		int [][] ret = new int [sz][sz];
		Random rand = new Random();
		HashSet<Integer> hs = new HashSet<>();
		for(int i = 0; i < sz; i++) {
			for(int j = 0; j < sz; j++) {
				int tmp = 0;
				do {
					tmp = rand.nextInt(mx) + 1;
				} while(hs.contains(tmp));
				hs.add(tmp);
				ret[i][j] = tmp;
			}
		}
		return ret;
	}

	// for testing
	// public void printBoard() {
	// 	for(int i = 0; i < sz; i++) {
	// 		for(int j = 0; j < sz; j++) {
	// 			System.out.print(this.board[i][j] + " ");
	// 		}
	// 		System.out.println();
	// 	}
	// }

	public void computerMarkSquare(int x) {
		if(!computerControlled) return;
		for(int i = 0; i < sz; i++) {
			for(int j = 0; j < sz; j++) {
				if(board[i][j] == x) {
					marks[i][j] = true;
				}
			}
		}
	}


	public boolean checkWin() {

		boolean win = true;

		// horizontal
		for(int i = 0; i < sz; i++) {
			win = true;
			for(int j = 0; j < sz; j++) {
				win = (win & marks[i][j]);
			}
			if(win) return true;
		}

		// vertical 
		for(int i = 0; i < sz; i++) {
			win = true;
			for(int j = 0; j < sz; j++) {
				win = (win & marks[j][i]);
			}
			if(win) return true;
		}

		// main diagonal
		win = true;
		for(int i = 0; i < sz; i++) {
			win = (win & marks[i][i]);
		}
		if(win) return true;

		// second diagonal
		win = true;
		for(int i = 0; i < sz; i++) {
			win = (win & marks[i][sz - i - 1]);
		}
		if(win) return true;

		return false;
	}
	
}