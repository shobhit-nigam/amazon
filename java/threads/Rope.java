package mahabharat;

public class Rope extends Thread {
	String name = "";

	public void run() {
		System.out.println("running");
		System.out.println(Thread.currentThread().getName());
	}
	
	public static void main(String[] args) {
		Rope ta = new Rope();
		Rope tb = new Rope();
		ta.setName("nylon thread");
		ta.setPriority(6);
		System.out.println("name of ta = "+ta.getName());
		System.out.println("id of ta = "+ta.getId());
		System.out.println("pri of ta = "+ta.getPriority());
		System.out.println("state of ta = "+ta.getState());
		System.out.println("state of ta = "+ta.getState());
		System.out.println(Thread.currentThread().getName());
		ta.start();
		tb.start();
	}

}
