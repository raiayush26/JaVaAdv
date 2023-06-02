interface MyDemo{
    void show();

    void show(String string);

}
class YourDemo{
    YourDemo(String msg) {
        System.out.println(msg);
    }
}
public class Demo21{
    public static void main(String[] args) {
        //Asd obj = new Asd();
        MyDemo md = obj :: new;
        md.show("Hello Vit");
    }



}
    