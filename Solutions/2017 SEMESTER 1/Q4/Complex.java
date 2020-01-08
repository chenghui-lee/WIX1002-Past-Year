
public class Complex {

    private double aR, bI;

    public Complex() {
    }

    public Complex(double aR, double bI) {
        this.aR = aR;
        this.bI = bI;

    }

    public Complex addComplexNum( Complex b) {
        double real = this.aR + b.aR;
        double imag = this.bI + b.bI;
        Complex result = new Complex(real, imag);
        return result;
    }

    public Complex subtractComplexNum(Complex b) {
        double real = this.aR - b.aR;
        double imag = this.bI - b.bI;
        Complex result = new Complex(real, imag);
        return result;
      
    }

    @Override
    public String toString() {
        return "(" + aR + " + " + bI + "i)";
    }

}
