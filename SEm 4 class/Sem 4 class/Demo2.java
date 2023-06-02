class Calc {
    public int add(int i,int j)
    {
        
        return i+j;
    }
}
class Calcad extends Calc{
    public int sub(int i,int j)
    {
        return i-j;
    }
}

public class Demo2 {
    public static void main(String args[]) {
        Calcad ob=new Calcad();
        int result = ob.add(20,15);
        System.out.println(result);

}
}