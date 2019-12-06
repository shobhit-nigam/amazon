package got;

public class Karstarks {

	public static void main(String[] args) {
		int data1 = 100;
		int data2 = 20;
		int data3 = 0;
		int arr[] = new int[5];
		String objs = null;
		try {
			arr[6] = 99;
			data2 = data1/data3;
			System.out.println(objs.length());
			System.out.println("data2="+data2);
		}
		catch(ArithmeticException obje) {
			System.out.println("something went wrong");
			System.out.println(obje);
		}
		catch(NullPointerException obje) {
			System.out.println("something went null");
//			System.out.println(obje);	
		}
		catch(Exception obje) {
			System.out.println("something went wrong, dont know what");
		}
		System.out.println("last line");
	}
}
		

