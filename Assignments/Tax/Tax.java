import java.util.*;

public class Tax {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Is married? [true / false]: ");
		boolean married = Boolean.parseBoolean(input.nextLine());
		System.out.print("Enter income: ");
		double income = input.nextDouble();
		double cutoff1 = 21450, cutoff2 = cutoff1 + 30450, tax = 0;
		if(married) {
			cutoff1 = 35800;
			cutoff2 = cutoff1 + 50700;
		}
		if(income > cutoff2) {
			tax += (income - cutoff2) * 0.31;
			income = cutoff2;
		}
		if(income > cutoff1) {
			tax += (income - cutoff1) * 0.28;
			income = cutoff1;
		}
		if(income > 0) {
			tax += income * 0.15;
		}
		String o = String.format("%.2f", tax);
		System.out.println(o);
	}
}