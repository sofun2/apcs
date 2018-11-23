import java.util.*;

public class Bug {

	private int pos = 0;
	private int dir = 1;

	public Bug (int initialPosition) {
		this.pos = initialPosition;
	}

	public void turn() {
		this.dir *= -1;
	}

	public void move() {
		this.pos += this.dir;
	}
 
	public int getPosition() {
		return this.pos;
	}
}