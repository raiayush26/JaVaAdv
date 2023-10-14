import java.util.ArrayList;
import java.util.Collections;
public class ArrayLists {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<Integer>();
        // Adding componet
        list.add(3);
        list.add(0);
        list.add(1);
        list.add(2);

          //  To add the element in middel
        list.add(3,5);
       
        System.out.println(  list);

        //  To remove the Element from the list
        list.remove(2);

        // to get the element
        System.out.print ("Geting the element by loop:- " );
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
        }
       
        // net line 
        System.out.println();
        // sorting the list
        Collections.sort(list);
        System.out.println(list);

        

      
        


    }
}
