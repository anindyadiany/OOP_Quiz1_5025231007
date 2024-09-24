package Q14;

public class Q14ComplexNumberTest {
    public static void main(String[] args) {
        Q14ComplexNumber num1 = new Q14ComplexNumber(5, 5);
        Q14ComplexNumber num2 = new Q14ComplexNumber(3, 5);

        num1.print();
        num2.print();
        
        Q14ComplexNumber num3 = new Q14ComplexNumber(0, 0);  
        System.out.print("addition: ");
        num3.print();
        
        Q14ComplexNumber num4 = new Q14ComplexNumber(0, 0);  
        num4.substraction(num1, num2);
        System.out.print("subtraction: ");
        num4.print();
        
        Q14ComplexNumber num5 = new Q14ComplexNumber(0, 0);  
        num4.multiplication(num1, num2);
        System.out.print("multiplication: ");
        num4.print();
    }
}
