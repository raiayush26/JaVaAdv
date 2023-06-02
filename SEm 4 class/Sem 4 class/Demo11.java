class A <T>{//generic class
    T i;
    public void add(T k) {
    i=k;        
    }
    public T get()
    {
        return (i);
    }
}
public class Demo11 {
    public static void main(String[] args) {
        A <Integer> obj1= new A <Integer>  () ;
        A <String> obj2 =new A <String>();      
        Integer k1=new Integer(5);
        obj1.add(k1);
        obj2.add("Vit");
        System.out.println("ob1= "+ obj1.get() + "obj2= " + obj2.get());

    }
}
