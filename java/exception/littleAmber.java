package got;

public class littleAmber extends Amberexception {
	littleAmber(String sa){
		super(sa);
		System.out.println("in little Amber");
	}
	public static void main(String[] args) {
		try {
			//some code
			throw new littleAmber("some data");
		}
		catch(littleAmber obje) {
			
		}
		catch(Amberexception obje) {
			
		}
		catch(Exception obje) {
			
		}

	}

}
