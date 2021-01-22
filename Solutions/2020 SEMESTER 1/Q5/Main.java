import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        Job j1 = new Job("J1", 252, 20);
        Job j2 = new Job("J2", 108, 10);
        Job j3 = new Job("J3", 72, 25);
        
        
        CloudPackage a = new CloudPackage("P2-15", 4, 15, 1.24);
        CloudPackage b = new CloudPackage("P2-30", 6, 30, 2.11);
        CloudPackage c = new CloudPackage("R5-20", 4, 20, 1.38);
        CloudPackage d = new CloudPackage("R6-20", 6, 20, 1.88);
        
        Job listOfJobs[] = {j1,j2,j3};
        CloudPackage listOfPackages[] = {a,b,c,d};
        
        double totalCost = 0;
        for(Job job : listOfJobs){
            CloudPackage cheapest = new CloudPackage("temp", 1, 5, 1000000);
            for(CloudPackage cp : listOfPackages){
                if (cp.check(job) && cp.totalCost(job) < cheapest.totalCost(job)){
                    cheapest = cp;
                }
            }
            totalCost += cheapest.getCost();
            System.out.println(job.toString());
            System.out.println(cheapest.toString());
        }
        System.out.printf("Total Cost: %.2f\n", totalCost);
    }
}
