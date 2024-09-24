package Q15;


public class Q15Weight {
	//property of poundsand kg
	private double pounds;
	private double kilograms;

	//constructor of pounds and kg
	public Q15Weight(double pounds) {
		super();
		this.pounds = pounds;
	}
	//setters and getters
	public void setKilograms(double kilograms) {
		this.kilograms = kilograms;
	}
	public void setPounds(double pounds) {
		this.pounds = pounds;
	}
	//getter returning pounds
	public double getPounds () {
		return pounds;
	}
	//getter returning kgs after converted from pounds to kg
	public double getKilograms () {
		return pounds * 0.45359237f;
	}
	
}

