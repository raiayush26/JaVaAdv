// copy construtor
public class Acces{
   
    public static void main(String[] args) {
        Student s1 =new Student();
        s1.name="ayush";
        s1.roll= 34;
        s1.password="efjiwe";
        s1.marks[0]=100;
        s1.marks[1]=99;
        s1.marks[2]=89;
        Student s2= new Student(s1);
        s2.password ="abcd";
        s1.marks[2]=100;
        for(int i=0;i<3;i++){
            System.out.println(s2.marks[i]);
        }
        


    }
    
}
class Student{
    String name;
    int roll;
    String password;
    int marks[];
    
    // shallow copy construtor
    // Student(Student s1){
    //     marks = new int[3];
    //     this.name=s1.name;
    //     this.roll=s1.roll;
    //     this.password =s1.password;
    //     this.marks= s1.marks;
    // }

    // deep copy construction
    Student(Student s1){
        marks = new int[3];
        this.name=s1.name;
        this.roll=s1.roll;
        this.password =s1.password;
        for(int i=0;i<marks.length;i++){
            this.marks[i]=s1.marks[i];
        }

    }

    Student(){
         marks = new int[3];
        System.out.println("hello");
    }
    Student(String name){
        marks = new int[3];
        this.name=name;
    }
    Student(int roll){
        marks = new int[3];
        this.roll=roll;
    }
   }
