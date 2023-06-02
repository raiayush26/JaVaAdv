import java.util.*;
public class Demo12{
    public static void main(String [] args){
        Array li =new ArrayList();
        li.add("Suresh");
        li.add("Mahesh");
        li.add("Rakesh");
        Iterator it =li.Iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }

    }
}