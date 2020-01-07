
public class LinearEquation {

    private int a, b, c, d, e, f;

    public LinearEquation(int a, int b, int c, int d, int e, int f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }

    public String toString() {
        String result = "";
        result += a + "x" + " + " + b + "y = " + e + "\n";
        result += c + "x" + " + " + d + "y = " + f;
        return result;
    }

    public boolean isSolvable() {
        return (a * d - b * c != 0);
    }

    public double computeX() {
        return (e * d - b * f) / (a * d - b * c);
    }

    public double computeY() {
        return (a * f - e * c) / (a * d - b * c);
    }

}
