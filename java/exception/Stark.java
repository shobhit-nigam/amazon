package got;

public class Stark {

	public static void main(String[] args) {
		int data1 = 100;
		int data2 = 20;
		int data3 = 0;
		System.out.println("Hacked!, Valar Morghulis!");
		try {
			data2 = data1/data1;
			System.out.println("data2="+data2);
		}
		catch(ArithmeticException obje) {
			System.out.println("something went wrong");
			System.out.println(obje);
			
		}
		Bolton objb = new Bolton();	
		try {
			objb.funca();
		}
		catch(Exception obje) {
			System.out.println("something went wrong, dont know what");
		}
		

	}

}
