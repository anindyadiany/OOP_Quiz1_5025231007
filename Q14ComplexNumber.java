package Q14;

public class Q14ComplexNumber {
	//properties and fields
    int real, imaginary;
    //setters and getters
    public int getReal() {
		return real;
	}
	public void setReal(int real) {
		this.real = real;
	}
	public int getImaginary() {
		return imaginary;
	}
	public void setImaginary(int imaginary) {
		this.imaginary = imaginary;
	}
	//constructors 
	public Q14ComplexNumber(int real, int imaginary) {
		super();
		this.real = real;
		this.imaginary = imaginary;
	}
	//printing the end results of the numbers
    public void print() {
        System.out.println("numbers: " + real + " + " + imaginary + "i");
    }
    //method for computing addition
    public void addition(Q14ComplexNumber n1, Q14ComplexNumber n2) {
        real = n1.real + n2.real;
        imaginary = n1.imaginary + n2.imaginary;
    }
  //method for computing substraction
    public void substraction(Q14ComplexNumber n1, Q14ComplexNumber n2) {
        real = n1.real - n2.real;
        imaginary = n1.imaginary - n2.imaginary;
    }
  //method for computing multiplication
    public void multiplication(Q14ComplexNumber n1, Q14ComplexNumber n2) {
        real = n1.real* n2.real;
        imaginary = n1.imaginary* n2.imaginary;
    }
}

