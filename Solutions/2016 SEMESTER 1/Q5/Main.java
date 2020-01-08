
public class Main {

    public static void main(String[] args) {
        Rebate r = new Rebate("John Lim","1111222233334444");
        Point p = new Point("John Lim", "5555444433332222");
        //Reward
        r.payment("grocery", 124.8);
        r.payment("other", 64.60);
        r.payment("fuel", 95.40);
        r.payment("utility", 100);
        r.payment("other", 220);
        System.out.print(r.toString());
        
        //Point
        p.payment("saturday", 124.80);
        p.payment("friday", 64.6);
        p.payment("sunday", 95.4);
        p.payment("friday", 100);
        p.payment("tuesday", 220);
        System.out.println(p.toString());
    }
    
}
