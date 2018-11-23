import java.lang.*;
import java.util.Scanner;

public class MilitaryTime {
	public static void main(String[] args) {
		int t1, t2, diff;
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the first time: ");
		t1 = input.nextInt();
		System.out.print("Please enter the second time: ");
		t2 = input.nextInt();
		t1 = t1 / 100 * 60 + t1 % 100;
		t2 = t2 / 100 * 60 + t2 % 100;
		diff = (t2 - t1 + 24 * 60) % (24 * 60);
		System.out.println((diff / 60) + " hours " + (diff % 60) + " minutes ");
	}
}