

class Pen {
    String color;
    String type;
    public void write(){
        System.out.println("writting something"); 
    }
    public void printColor(){
        System.out.println(this.color);
    }
}
// Copy construtor
 class Student{
     String name;
     int age;

     public void printInfo(){
         System.out.println(this.name);
         System.out.println(this.age);

     }
     public int printInfo(int age){
        return age;
     }
     public String printInfo(String name){
        return name;
     }
     public void printInfo(String name , int age){
        System.out.println(name+" "+age);
     }
     Student(Student s2){
         this.name =s2.name;
         this.age =s2.age;
     }
    public Student() {
    }
     
 }
public class OOP {
       public static void main(String[] args) {
           Student s1 = new Student(); 
           s1.name ="ayush";
           s1.age= 21;
           Student s2 = new Student(s1);
           s2.printInfo(); 
           s2.printInfo(45);     
           s2.printInfo("na");     
           s2.printInfo("na",56);     
    }
}


