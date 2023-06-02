import java.io.*;

public class Demo33 {
    public static void main(String[] args) throws FileNotFoundException,IOException {
        FileOutputStream fo =new FileOutputStream("csee.txt");
        fo.write(5);
        fo.close();




    }
}
