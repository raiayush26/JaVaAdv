package COM.AYUSH;
import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        // input
        for(int i=0;i<5;i++){
            list.add(in.nextInt());
        }
        //  getting the array
        for(int i=0;i<5;i++){
               System.out.println(list.get(i));
        }


    }
    
}
