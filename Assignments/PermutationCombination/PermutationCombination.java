import java.lang.*;
import java.util.Scanner;

public class PermutationCombination {
	
	public static int fact(int n) {
		int ret = 1;
		for(int i = 1; i <= n; i++) ret *= i;
		return ret;	
	}

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter something: ");
		String s = input.next();
		int arg1 = 1, arg2 = 2, op = 0;
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == 'C' || s.charAt(i) == 'P') {
				op = s.charAt(i) == 'C' ? 1 : 0;
				arg1 = Integer.parseInt(s.substring(0, i));
				arg2 = Integer.parseInt(s.substring(i + 1, s.length()));
				break;	
			}	
		}
		if(arg2 > arg1) {
			System.out.println("Invalid input");
			return;
		}
		if(op == 1) {
			System.out.println(fact(arg1) / (fact(arg2) * fact(arg1 - arg2)));	
		}
		else {
			System.out.println(fact(arg1) / fact(arg1 - arg2));
		}		
	}	
}
