import java.lang.reflect.Array;

public class Sort {

	public static void main(String[] args) {
		int arr [] = new int[] {13, 4, 6, 23, 4, 78};
		display(arr);
		quickSort(arr, 0, arr.length-1);
		System.out.println();
		display(arr);
	}
	public static void bubbleSort(int [] arr) {
		boolean s = false;
		int temp;
		while(!s) {
			s = true;
			for(int i=0; i< arr.length -1 ; i++){
				if(arr[i] > arr[i+1]) {
					temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
					s = false;
				}
			}
		}
	}
	public static void insertionSort(int[] arr) {
		for(int i=1; i<arr.length; i++) {
			int cur = arr[i];
			int j=i-1;
			while(j >= 0 && cur <arr[j]) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = cur;
		}
	}
	public static void selectionSort(int [] arr) {
		for (int i=0; i<arr.length; i++) {
			int min = arr[i];
			int id = i;
			for(int j=i+1; j<arr.length; j++) {
				if(arr[j] < min) {
					min = arr[j];
					id = j;
				}
			}
			int temp = arr[i];
			arr[i] = min;
			arr[id] = temp;
		}
	}
	public static void quickSort(int[] arr, int start, int end) {
		if(end<=start) {
			return;
		}
		int pivot = partition(arr, start, end);
		quickSort(arr, start, pivot-1);
		quickSort(arr, pivot+1, end);
		
	}
	public static int partition(int[] arr, int start, int end) {
		int pivot = end;
		int count = start;
		for(int i=start; i<end; i++) {
			if(arr[i]<arr[pivot]) {
				int temp = arr[count];
				arr[count] = arr[i];
				arr[i] = temp;
				count++;
			}
		}
		int temp = arr[pivot];
		arr[pivot] = arr[count];
		arr[count] = temp;
		return count;
	}
	public static void display(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}


