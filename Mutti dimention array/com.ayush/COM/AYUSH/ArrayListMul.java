package COM.AYUSH;

import java.util.*;

public class ArrayListMul {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList();
        // Initilzation
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());    
        }
        // add element
        for (int i = 0; i < 3; i++) {
            list.get(i).add(sc.nextInt());
            
        }
        System.out.println(list);
    }
    
}
