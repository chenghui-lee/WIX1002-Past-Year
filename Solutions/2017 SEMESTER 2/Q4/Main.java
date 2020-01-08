
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {

    public static void main(String[] args) {
        generateFile();
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("Q4.dat"));
            try{
                while(true){
                    String temp = in.readUTF();
                    int q = Integer.parseInt(temp.substring(0,2));
                    int m = Integer.parseInt(temp.substring(2, 4));
                    int y = Integer.parseInt(temp.substring(4));
                    DayOfTheWeek k = new DayOfTheWeek(q, m, y);
                    System.out.println(k.toString());
                }
            }catch(EOFException e){
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void generateFile() {
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Q4.dat"));
            out.writeUTF("25032017");
            out.writeUTF("29022100");
            out.writeUTF("19012017");
            out.writeUTF("31092015");
            out.writeUTF("31052017");
            out.writeUTF("29022016");
            out.close();
        } catch (IOException e) {
            System.out.println("Error while generating file.");
        }
    }

}
