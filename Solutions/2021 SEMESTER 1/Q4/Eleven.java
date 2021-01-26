
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public abstract class Eleven {
    protected int[] arr;
    protected String fileName;

    public Eleven(String fileName) {
        this.fileName = fileName;
        int n = 0;
        try{
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(fileName));
            try{
                while(true){
                    in.readInt();
                    n++;
                }
            }catch(EOFException eof){}
            
            in = new ObjectInputStream(new FileInputStream(fileName));
            arr = new int[n];
            int i = 0;
            try{
                while(true){
                    arr[i++] = in.readInt();
                }
            }catch(EOFException eof){}
        }catch(IOException e){}
    }
    public abstract String divide();
    
}
