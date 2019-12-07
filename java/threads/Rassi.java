package mahabharat;

public class Rassi extends Thread {
	static int j = 0;
	public void run() {
		for(int i=0; i<5; i++) {
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException obje) {
				System.out.println("exception occured");				
			}
			System.out.println("running i="+i);
//			++j;
		}
	}

	public static void main(String[] args) {
		Rassi ta = new Rassi();
		Rassi tb = new Rassi();
		Rassi tc = new Rassi();
		ta.start();
		tb.start();
		try {
			ta.join();
//			tb.join();
		}
		catch(Exception obje) {
			System.out.println(obje);
		}
//		tb.start();
		tc.start();
	}

}
