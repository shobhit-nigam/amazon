
public class Search {
	static public int n =0;
	// Linear Search
	// time O(n)
	// space O(1)
	public static void main(String[] args) {
		int arr[] = new int[] {11, 22, 33, 44, 55, 66, 77, 88, 99,111, 222, 333, 444, 555, 666};
		int i = jumpSearch(arr, 999);
		System.out.println(i);
		System.out.println(n);
				
	}
	public int linearSearch(int arr[], int num){
		for(int i=0; i<arr.length; i++) {
			if(arr[i]== num) {
				return i;
			}
		}
		return -1;
	}
	
	public static int jumpSearch(int[] integers, int num) {
	int arrayLength = integers.length;
	int step = (int) Math.sqrt(integers.length);
	int previousStep = 0;
	while(integers[Math.min(step,  arrayLength) -1] < num) {
		previousStep = step;
		step = step + (int) (Math.sqrt(arrayLength));
		if(previousStep >= arrayLength) {
			return -1;
		}
		n++;
	}
	while(integers[previousStep] < num) {
		previousStep++;
		if(previousStep == Math.min(step, arrayLength)) {
				return -1;
		}
		n++;
	}
	if(integers[previousStep] == num){
		return previousStep;
	}
	return -1;
	}
}
