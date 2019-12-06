package got;

public class chotaUmber extends Umber {
	String place = "partial_north";
	chotaUmber(){
		super(45);
		System.out.println("chota umber constructor");
//		System.out.println("la in chota umber ="+la);
	}
	void funca(String place) {
		System.out.println(place);
//		this.place = place;
		System.out.println(this.place);
		System.out.println(super.place);
		funcb();
		super.funcb();
	}
	void funcb() {
		System.out.println("function of chota");
	}
	
	public static void main(String[] args) {
		chotaUmber objc = new chotaUmber();
		chotaUmber objd = new chotaUmber();
		objc.funca("south");
	}
}
