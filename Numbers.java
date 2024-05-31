public class Numbers {
    private double imaginary;
    private double real;


    public Numbers(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }
  
    public Numbers add(Numbers other) {
        double realSum = this.real + other.real;
        double imaginarySum = this.imaginary + other.imaginary;
        return new Numbers(realSum, imaginarySum);
    }
    
    public Numbers multiply(Numbers other) {
        double realProduct = this.real * other.real - this.imaginary * this.imaginary;
        double imaginaryProduct = this.real * other.imaginary + this.imaginary * other.real;
        return new Numbers(realProduct, imaginaryProduct);
    }
    
    public Numbers divide(Numbers other) {
        double denominator = other.real * other.real + other.imaginary * other.imaginary;
        double realQuotient = (this.real * other.real + this.imaginary * other.imaginary) / denominator;
        double imaginaryQuotient = (this.imaginary * other.real - this.real * other.imaginary) / denominator;
        return new Numbers(realQuotient, imaginaryQuotient);
    }
    
    @Override
    public String toString() {
        if (imaginary >= 0) {
        return real + " + " + imaginary + "i";
        } else {
        return real + " - " + Math.abs(imaginary) + "i";
        }
    }
}



















