package mahabharat;

public class Dhaga implements Runnable {

	@Override
	public void run() {
		System.out.println("moh moh ke dhaage");
	}

	public static void main(String[] args) {
		Dhaga da = new Dhaga();
		Thread ta = new Thread(da);
		ta.start();

	}

}
