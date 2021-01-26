public class Main {
    public static void main(String[] args) {
        DivideF1 a = new DivideF1("data.dat");
        DivideF2 b = new DivideF2("data.dat");
        display(a);
        display(b);
    }    
    public static void display(Eleven el){
        System.out.println(el.divide());
    }
}
