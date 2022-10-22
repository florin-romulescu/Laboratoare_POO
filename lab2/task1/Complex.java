package lab2.task1;

public class Complex {
    private int real;
    private int imaginary;

    public Complex() {
        this.real = 0;
        this.imaginary = 0;
    }

    public Complex(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public Complex(Complex number) {
        this.real = number.real;
        this.imaginary = number.imaginary;
    }

    public int getReal() {
        return real;
    }

    public int getImaginary() {
        return imaginary;
    }

    public void setReal(int real) {
        this.real = real;
    }

    public void setImaginary(int imaginary) {
        this.imaginary = imaginary;
    }

    public void addWithComplex(Complex complex) {
        this.real += complex.getReal();
        this.imaginary += complex.getImaginary();
    }

    void showNumber() {
        if (this.imaginary > 0) {
            System.out.println(this.real + "+i*" + this.imaginary);
        } else if (this.imaginary < 0) {
            System.out.println(this.real + "-i*" + (-this.imaginary));
        } else {
            System.out.printf(Integer.toString(this.real));
        }
    }
}
