package mahabharat;

public class Dhaaram extends Thread {
	public void run() {
		for(int i=0; i<5; i++) {
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException obje) {
				System.out.println("exception occured");
				
			}
			System.out.println("running i="+i);
		}
	}

	public static void main(String[] args) {
		Dhaaram ta = new Dhaaram();
		Dhaaram tb = new Dhaaram();
		ta.start();
		tb.start();
		try {
			Thread.sleep(10000);
		}
		catch(InterruptedException obje) {
			System.out.println("exception occured");
			
		}
		ta.start();

	}

}
