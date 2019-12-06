package got;

public class Mormont {
	
	static void check(int age) {
		if(age<24) {
			throw new ArithmeticException("underage");
		}
		else {
			System.out.println("welcome to the match");
		}
	}

	void funca() throws ArithmeticException{
		
	}
	public static void main(String[] args) {
		try {
			check(14);
		}
		catch(ArithmeticException obje) {
			System.out.println(obje);
		}
	}

}
