class A{
    
}
// print the program after the n sec
class CSE extends Thread {
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println("I am in class");
            try {Thread.sleep(1000);} catch (Exception e) {}
     }
}
}
class VIT extends Thread {
public void run(){
    for (int i=0;i<5;i++){
        System.out.println("I am in Vit");
    try {Thread.sleep(2000);} catch (Exception e){}
}
}
}
public class Demo2{
    public static void main(String[] args) {
    CSE obj1=new CSE();
    VIT obj2=new VIT();
    obj1.start();
    obj2.start();
    }
}        