import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import java.awt.event.*;


public class Square{

	public static Boolean t = false;
	public int x, y, xsz, ysz;
	public String s = "";

	Square() {;}

	Square(int aa, int ab, int ac, int ad, String ae) {
		x = aa;
		y = ab;
		xsz = ac;
		ysz = ad;
		s = ae;
	}

	public void updateSquare() {
		if(!s.equals("")) return;
		s = (t == false ? "X" : "O");
		t = !t;
	}
}	
