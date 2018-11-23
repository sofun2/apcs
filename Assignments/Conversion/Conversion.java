import java.lang.*;
import java.util.Scanner;

public class Conversion {
	public static void main(String[] args) {
		double [][] a = { 
			{29.5735, 0.02957, -1, -1, -1, -1, -1, -1}, 
			{-1, -1, 28.3495, 0.0283495, -1, -1, -1 ,-1}, 
			{3785.41, 3.78541, -1, -1, -1, -1, -1, -1}, 
			{-1, -1, 453.592, 0.453592, -1, -1, -1, -1}, 
			{-1, -1, -1, -1, 25.4, 2.54, 0.0254, 0.0000254}, 
			{-1, -1, -1, -1, 304.8, 30.48, 0.3048, 0.0003048}, 
			{-1, -1, -1, -1, 1609340, 160934, 1609.34, 1.06934}};
		
		Map<String, Integer> m = new HashMap<>();
		// input units
		m.put("floz", 0);
		m.put("oz", 1);
		m.put("gal", 2);
		m.put("lb", 3);
		m.put("in", 4);
		m.put("ft", 5);
		m.put("mi", 6);
		// output units
		m.put("ml", 0);
		m.put("l", 1);
		m.put("g", 2);
		m.put("kg", 3);
		m.put("mm", 4);
		m.put("cm", 5);
		m.put("m", 6);
		m.put("km", 7);

		Scanner input = new Scanner(System.in);
		String from, to;
		double v = 0.0;
		System.out.print("Enter the units to convert from: floz, gal, oz, lb, in, ft, mi \n > ");
		from = input.nextLine();
		System.out.print("Enter the units to convert to: ml, l, g, kg, mm, cm, m, km \n > ");
		to = input.nextLine();
		System.out.print("Enter the quantity \n > ");
		v = input.nextDouble();
		if(!m.containsKey(from) || !m.containsKey(to)) {
			System.out.println("Invalid units");
			return;
		}
		double factor = a[m.get(from)][m.get(to)];
		if(factor == -1) 
			System.out.println("Incompatible conversion");
		else
			System.out.println(v * factor);
	}
}
