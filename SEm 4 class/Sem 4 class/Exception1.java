import java.io.*;
import java.util.Scanner;

public class Exception1 {
    public static void main(String[] args) throws FileNotFoundException,IOException{
        Scanner input=new Scanner(System.in);
        System.out.println("Enter source file name");
        String sf=input.nextLine();
        System.out.println("Enter Destixation File name");
        String df=input.nextLine();
        FileInputStream fis=new FileInputStream(sf);
        FileOutputStream fos =new FileOutputStream(df);
        int data;
        while ((data =fis.read())!=-1) {
            fos.write(data);
        }
        fis.close();
        fos.close();
    
}
}
