import java.util.*;

public class DataSet{
	private ArrayList<Integer> a = new ArrayList<Integer>();

	void addValue(int x) {
		a.add(x);
	}

	int getSum() {
		int sum = 0;
		for(int i = 0; i < a.size(); i++) {
			sum += a.get(i);
		}
		return sum;
	}

	double getAverage() {
		int sum = getSum();
		return ((double)sum / a.size());
	}

	int getLargest() {
		int mx = -1;
		for(int i = 0; i < a.size(); i++) {
			mx = Math.max(mx, a.get(i));
		}
		return mx;
	}
	
	int getSmallest() {
		int mn = 999999999;
		for(int i = 0; i < a.size(); i++) {
			mn = Math.min(mn, a.get(i));
		}
		return mn;
	}
}