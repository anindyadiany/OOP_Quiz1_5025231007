package Q16;

public class Q16FractionTest {
	public static void main(String[] args) {
		Q16Fraction f1 = new Q16Fraction(1,2);
		Q16Fraction f2 = new Q16Fraction(3,7);
		f1.toString();
		System.out.println(f1.toString());
		System.out.println(f2.getProduct(f1));
		System.out.println(f2.getSum(f1));
		
//        f2.getProduct(f1);
//        f1.getSum(f2);
    }
}
