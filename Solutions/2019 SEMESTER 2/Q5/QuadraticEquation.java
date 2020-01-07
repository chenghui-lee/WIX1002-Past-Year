
public class QuadraticEquation {

    private double a, b, c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double Discriminant() {
        return Math.pow(b, 2) - 4 * a * c;
    }

    public double calcRoot1() {
        if (Math.pow(b, 2) - 4 * a * c < 0) {
            return 0;
        }
        return (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
    }
    public double calcRoot2() {
        if (Math.pow(b, 2) - 4 * a * c < 0) {
            return 0;
        }
        return (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
    }
}
