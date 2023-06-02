class box{
    int lenght;
    int height;
    int weight;
    int dimension;

box(int x,int y ,int z){
    lenght=x;
    height=y;
    weight=z;
    dimension=x*y*z;
}}


public class box2 {
    public static  void main (String args[]){ 
    box carboard= new box(15,16,12);
    
    System.out.println("the dimension of cardboard is "+carboard.dimension);
    }
    
}