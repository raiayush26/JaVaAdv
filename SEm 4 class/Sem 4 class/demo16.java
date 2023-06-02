// Fitler user using string
import java.util.*;

class Laptop{
    int model;
    String company;
    int price;
    public Laptop(int model, String company, int price){
        this.model=model;
        this.company=company;
        this.price=price;
    }
}
public class demo16 {
    public static void main(String[] args) {
        List<Laptop> Laptoplist=new ArrayList<Laptop>();
        Laptop L1,L2,L3;
        L1 = new Laptop(101,"HP",5000);
        L2 = new Laptop(102,"Dell",4000);
        L3 = new Laptop(103,"Arus",36000);
        Laptoplist.add(L1);
        Laptoplist.add(L2);
        Laptoplist.add(L3);
        Laptoplist.stream()
            .filter(p-> p.price>4000)
            .forEach(p->System.out.println(p.company));
    }
    
}