import java.util.ArrayList;
import java.util.List;

class A {}

class B extends A {}

class C extends B {}

public class Test {
    public static void main(String[] args) {

        List<? super B> l1 = new ArrayList<>();
       List<?extends B > l2= new ArrayList<>();
       l1.add(new A());
      

    }
}