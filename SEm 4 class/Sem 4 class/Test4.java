class Test{
    int a;//Bydeafut is public 
    public  int b ;
    private int c;
    void setc(int i){
        c=i;
    }
    int m(){
        return c;
    }
}
class Test4{
    public static void main (String args[]){     
    Test ob1=new Test(); 
    ob1.a=10; 
    ob1.b=20; 
    ob1.setc(30);
    System.out.println("the value of a is "+ob1.a);
    System.out.println("the value of b is "+ob1.b);
    System.out.println("the value of c is "+ob1.m());
}
}