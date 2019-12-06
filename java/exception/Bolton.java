package got;

public class Bolton {
	void funca() {
		try {
			int data2 = 2/0;
		}
		catch(NullPointerException obje) {
			System.out.println("caught inside function");
//			throw obje;
		}
	}

	public static void main(String[] args) {

	}

}
