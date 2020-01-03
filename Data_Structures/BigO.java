import java.util.*;

public class BigO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	// O(1)
	public boolean funca(ArrayList<Integer> num) {
		return num.get(0) == 20;
	}
	// O(n)
	public boolean funcb(ArrayList<Integer> num, int la) {
		for(Integer x:num) {
			if(x == la) {
				return true;
			}
		}
		return false;
	}
	// O(n2)  quadratic
	public boolean funC(List<String> input) {
		for(int i=0; i<input.size(); i++) {
			for(int j =0; j<input.size(); j++) {
				if(i != j && input.get(i).equals(input.get(j))){
					return true;
				}
			}
		}
		return false;
	}
	// O(2n) exponential
	public int fibonacci(int num) {
		if(num <=1) {
			return num;
		}
		else {
			return fibonacci(num-1) + fibonacci(num-2);
		}
	}
	public void funcD(int num) {
		for(int i=1; i <= Math.pow(2, num); i++) {
			System.out.println(i);
		}
	}
	// O(log n)
	// binary search as an example
	public boolean funcE(ArrayList<Integer> nums, int la) {
		int low = 0;
		int high = nums.size() - 1;
		while(low <= high) {
			int mid = low + (high -low)/2;
			if(la < nums.get(mid)) {
				high = mid -1;
			}
			else if (la > nums.get(mid)) {
				
			}
			else {
				return true;
			}
		}
		
		return false;
	}
	public void funcF(int num) {
		for(int i=1; i<=num; i++) {
			for(int j=1; j<8; j = j*2) {
				// num=8, 8* log(8) = 24
			}
		}
	}
}






