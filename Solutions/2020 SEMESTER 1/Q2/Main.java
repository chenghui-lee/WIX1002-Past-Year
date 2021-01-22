
import java.util.Scanner;

public class Main {
    static int location1[][] = new int[2][4], location2[][] = new int[2][4];
    static double degree1[] = new double[2], degree2[] = new double[2];
    // location1 = {lat, deg, min, sec
    //              long, deg, min, sec}
    public static void main(String[] args) {
        request();
        convertToDegree();
        System.out.printf("Location 1 : %.6f Latitude , %.6f Longtitude\n", degree1[0], degree1[1]);
        System.out.printf("Location 2 : %.6f Latitude , %.6f Longtitude\n", degree2[0], degree2[1]);
        System.out.printf("Distance : %.2f KM\n", calculateDistance());
        
    }
    public static void request(){
        Scanner s = new Scanner(System.in);
        
        // Location 1
        System.out.println("Enter Location 1");
        System.out.print("Enter Direction: [N, S, E, W]: ");
        char c = s.next().charAt(0);        
        if (c == 'N') toPositive(0,1);
        System.out.print("Enter Degree, Minute and Second : ");
        for(int i=0; i<3; i++) location1[0][i] = s.nextInt();
        
        System.out.print("Enter Direction: [N, S, E, W]: ");
        c = s.next().charAt(0);
        if (c == 'E') toPositive(1,1);
        System.out.print("Enter Degree, Minute and Second : ");
        for(int i=0; i<3; i++) location1[1][i] = s.nextInt();
        
        // Location 2
        System.out.println("Enter Location 2");
        System.out.print("Enter Direction: [N, S, E, W]: ");
        c = s.next().charAt(0);        
        if (c == 'N') toPositive(0,2);
        System.out.print("Enter Degree, Minute and Second : ");
        for(int i=0; i<3; i++) location2[0][i] = s.nextInt();
        
        System.out.print("Enter Direction: [N, S, E, W]: ");
        c = s.next().charAt(0);
        if (c == 'E') toPositive(1,2);
        System.out.print("Enter Degree, Minute and Second : ");
        for(int i=0; i<3; i++) location2[1][i] = s.nextInt();
    }
    
    public static void toPositive(int type, int location){
        if (location == 1) location1[type][3] = 1;
        else location2[type][3] = 1;
    }
    
    public static void convertToDegree(){
        // Location 1
        for(int i=0; i<2; i++){
            int degree = location1[i][0];
            int minute = location1[i][1];
            int second = location1[i][2];
            degree1[i] = degree + (double)(minute * 60 + second) / 3600;
            if (location1[i][3] == 0) degree1[i] *= -1;
        }
       
        // Location 2
        for(int i=0; i<2; i++){
            int degree = location2[i][0];
            int minute = location2[i][1];
            int second = location2[i][2];
            degree2[i] = degree + (double)(minute * 60 + second) / 3600;
            if (location2[i][3] == 0) degree2[i] *= -1;
        }
    }
    
    public static double calculateDistance(){
        double la1 = Math.toRadians(degree1[0]);
        double long1 = Math.toRadians(degree1[1]);
        double la2 = Math.toRadians(degree2[0]);
        double long2 = Math.toRadians(degree2[1]);
        
        double a = Math.sin((la1-la2)/2) * Math.sin((la1-la2)/2) + Math.cos(la1) 
                * Math.cos(la2) * Math.sin((long1-long2)/2) * Math.sin((long1-long2)/2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt((1-a)));
        
        return 6371 * c;
    }
}
