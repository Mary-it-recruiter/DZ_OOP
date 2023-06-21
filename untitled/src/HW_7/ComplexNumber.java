package HW_7;

public class ComplexNumber {
    private  double real;
    private  double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

//    public ComplexNumber add(ComplexNumber other) {
//        return new ComplexNumber(this.real + other.real, this.imaginary + other.imaginary);
//    }
    public ComplexNumber add(ComplexNumber other) {
        if (other == null) {
            return new ComplexNumber(this.real, this.imaginary);
        }
        return new ComplexNumber(this.real + other.real, this.imaginary + other.imaginary);
    }

//    public ComplexNumber subtract(ComplexNumber other) {
//        return new ComplexNumber(this.real - other.real, this.imaginary - other.imaginary);
//    }

    public ComplexNumber subtract(ComplexNumber other) {
        if (other == null) {
            return new ComplexNumber(this.real, this.imaginary);
        }
        return new ComplexNumber(this.real - other.real, this.imaginary - other.imaginary);
    }

    public ComplexNumber multiply(ComplexNumber other) {
        double real = this.real * other.real - this.imaginary * other.imaginary;
        double imaginary = this.real * other.imaginary + this.imaginary * other.real;
        return new ComplexNumber(real, imaginary);
    }

    public ComplexNumber divide(ComplexNumber other) {
        double denominator = other.real * other.real + other.imaginary * other.imaginary;
        double real = (this.real * other.real + this.imaginary * other.imaginary) / denominator;
        double imaginary = (this.imaginary * other.real - this.real * other.imaginary) / denominator;
        return new ComplexNumber(real, imaginary);
    }

    public ComplexNumber power(int n) {
        double modulus = Math.pow(getModulus(), n);
        double argument = n * getArgument();
        double real = modulus * Math.cos(argument);
        double imaginary = modulus * Math.sin(argument);
        return new ComplexNumber(real, imaginary);
    }

    public ComplexNumber squareRoot() {
        double modulus = Math.sqrt(getModulus());
        double argument = getArgument() / 2;
        double real = modulus * Math.cos(argument);
        double imaginary = modulus * Math.sin(argument);
        return new ComplexNumber(real, imaginary);
    }

    public double getModulus() {
        return Math.sqrt(real * real + imaginary * imaginary);
    }

    public double getArgument() {
        return Math.atan2(imaginary, real);
    }

    @Override
    public String toString() {
        return String.format("%.2f + %.2fi", real, imaginary);
    }

    public Object getReal() {
        return real;
    }
}
