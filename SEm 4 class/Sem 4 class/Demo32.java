import java.io.*;

public class Demo32 {
 public static void main(String[] args) throws FileNotFoundException,IOException {
     FileInputStream fi = new FileInputStream("vit.txt");
     int data;
     while ((data= fi.read())!=-1) {
        System.out.print((char)data);
        fi.close();
         
     }
    
 }

    
}
