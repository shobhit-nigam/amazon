package mahabharat;

public class Arjuna extends Thread {
	public void run(){
		System.out.println("thread is running");
	}

	public static void main(String[] args) {
		Arjuna ta = new Arjuna();
		ta.start();
	}

}
