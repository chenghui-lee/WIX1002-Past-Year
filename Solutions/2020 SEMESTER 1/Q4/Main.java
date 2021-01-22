
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n = 0;
        int numOfJob = 0;
        String records[][] = new String [100][22];
        try{
            Scanner s = new Scanner(new FileInputStream("sampleLog"));
            n = 0;
            while(s.hasNextLine()){
                n++;
                s.nextLine();
            }
            records = new String[n][22];
            s = new Scanner(new FileInputStream("sampleLog"));
            int i = 0;
            while(s.hasNextLine()){
                records[i] = s.nextLine().split(" ");
                if (records[i][1].contains("user=") && records[i][1].contains(";S;")) numOfJob++;
                i++;
            }
        }catch(IOException e){}
        System.out.println("Reading from log file...");
        System.out.println("**********************************************");
        System.out.println("Records read from log file");
        
        for(int i=0; i<n; i++){
            System.out.printf("Record %d:\n", i+1);
            for(String item : records[i]){
                if (!item.isBlank()) System.out.printf("\t%s\n", item);
            }
            System.out.println("");
        }
        System.out.println("total records read: " + n);
        System.out.println("**********************************************");
        System.out.println("Print user submission stat");
        System.out.println("");
        System.out.println("User\t\t\tJobs Submitted");
        System.out.println("----\t\t\t--------------");
        
        String users[] = new String[numOfJob];
        int userJobs[] = new int[numOfJob];
        int idx = 0;
        for(int i=0; i<n; i++){
            if (records[i][1].contains("user") && records[i][1].contains(";S;") ){
                String user = records[i][1].substring(records[i][1].indexOf("user")+5);
                boolean found = false;
                for(int j=0; j<idx; j++){
                    if (users[j].equals(user)){
                        userJobs[j]++;
                        found = true;
                    }
                }
                if (!found){
                    users[idx] = user;
                    userJobs[idx++]++;
                }
            }
        }
        int numOfUser = 0; 
        for(int i=0; i<userJobs.length; i++){
            if (userJobs[i] !=0) numOfUser++;
        }
        
        for(int i=0; i<numOfUser; i++){
            System.out.println(users[i] + "\t\t\t" + userJobs[i]);
        }
        System.out.println("");
        System.out.println("**********************************************");
        System.out.println("Print jobs status");
        System.out.println("");
        
        System.out.println("Job ID\tSubmitted (queue)\tStarted (start time)\tExpired (end time/error)");
        System.out.println("------\t-----------------\t--------------------\t------------------------");
        
        for(int i=0; i<n; i++){
            if (records[i][1].contains(";Q;")){ // Queue
                 String jobID = records[i][1].substring(records[i][1].indexOf(";Q;")+3, records[i][1].indexOf(".ce2.dicc"));
                 String queue = records[i][1].substring(records[i][1].indexOf("queue=")+6);
                 boolean started = false;
                 String startTime = "";
                 for(int j=i+1; j<n;j++){
                     if (records[j][1].contains(";S;") && records[j][1].contains(jobID)){
                         started = true;
                         startTime = records[j][8].substring(6);
                         boolean ended = false;
                         String exitStatus = "";
                         for(int k = j+1; k<n; k++){
                             if (records[k][1].contains(";E;") && records[k][1].contains(jobID)){
                                 ended = true;
                                 exitStatus = records[k][records[k].length-5].substring(12);
                                 if (exitStatus.equals("1")){ // ended successfully
                                     exitStatus = records[k][records[k].length-6].substring(4);
                                 }else{ // Error
                                     exitStatus = "Error: Exit Status " + exitStatus;
                                 }
                             }
                         }
                         if (!ended){
                             exitStatus = "null";
                         }
                         System.out.printf("%s\t%-5s (%s)\t%10s (%s)\t%s\n", jobID, "Y",queue,"Y", startTime, exitStatus);
                     }
                 }
            }
        }
        
    }    
}
