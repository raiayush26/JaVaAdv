interface Myasd{
    void show();

}
public class Asd{
    public  void myshow() {
        System.out.println("I am in my myshow ");
    }
    public static void main(String[] args) {
        Asd obj = new Asd();
        Myasd md = obj::myshow;
        md.show();
    }

}
