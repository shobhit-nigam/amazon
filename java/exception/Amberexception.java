package got;

public class Amberexception extends Exception {
	Amberexception(String sa){
		System.out.println();
	}

	public static void main(String[] args) {
		try {
			//some code
			throw new Amberexception("some data");
		}
		catch(Amberexception obje) {
			
		}
		catch(Exception obje) {
			
		}

	}

}
