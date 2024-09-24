package Q16;

public class Q16Fraction {
	//properties and fields as instructed, numerator and denominator
	private int numerator;
	private int denominator;
	
	//constructors, numerator and denominator
	public Q16Fraction(int numerator, int denominator) {
		this.numerator=numerator;
		this.denominator=denominator;
	}
	
	//setter getters, numerator and denominator 
	public int getNumerator() {
		return numerator;
	}
	public int getDenominator() {
		return denominator;
	}
	//toString method, which returns numerator+ "/" +denominator
	public String toString() {
		return numerator + " / " + denominator;
	}
	public String getSum(Q16Fraction other) {
		int es = (this.numerator*other.denominator)+(other.numerator*this.denominator);
		int ds = this.denominator*other.denominator;
		Q16Fraction sum = new Q16Fraction(es, ds);
        //returning the string representation of the sum, calling toString
        return sum.toString();
		//return es + "/" + ds;
		//System.out.println(es + "/" + ds);
	}
	public String getProduct(Q16Fraction other) {
		int ep=this.numerator*other.numerator;
		int dp=this.denominator*other.denominator;
		Q16Fraction prod = new Q16Fraction(ep, dp);
        //returning the string representation of the product,, calling toString
        return prod.toString();
		//return ep + "/" + dp;
		//System.out.println(ep+ "/" + dp);
	}
	
	
}
