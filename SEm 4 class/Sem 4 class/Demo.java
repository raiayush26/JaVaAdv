class Calc {
    public int add(int ... i)
    {
        int sum=0;
        for (int a:i)
        {
            sum=sum+a;
        }
        return sum;
    }
    
}
public class Demo{
    public static void main(String args[]) {
        Calc obj=new Calc();
        int sum;
        sum=obj.add(5,6);
        System.out.println(sum);
        
    }

    public void mymethod(String[] capital) {
    }
}

