
class Circle{
    int reactangle;
    int square;

    public void display(){
        System.out.println("shape");
    }
    Circle(int a,int b){
        this.reactangle = a;
        this.square = b;
    }
    public void sub(){
        System.out.println(this.square+this.reactangle);
    }

}
class Shape {

public static void main(String[] args) {
    
    Circle  a =new Circle(1,2);
    a.display();
    a.sub();
    
}

}