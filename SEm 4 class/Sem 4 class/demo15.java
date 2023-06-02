// TreeSet Example
import java.util.*;
class Student{
    private String Name;
    private int roll;
}

public Student(String name, int roll) {
    this.Name=name;
    this.roll=roll;    
}
public String getname(){
    return Name;
}
public int getroll(){
    return roll;
}
public class Demo15{
    public static void main(String [] args){
        Student s1,s2,s3;
        s1=new Student ("Suresh",101);
        s2=new Student ("Mahesh",102);
        s3=new Student ("Rakesh",103);
    
    TreeSet t1 =new TreeSet();
    t1.add(s1);
    t1.add(s2);
    t1.add(s3);
    }
}
// class DemoCompare implements Comparator{
//     public int compare (Obeject o1 ,Obeject o2) {
//         Student stu1=(Student)o1;        
//         Student stu2=(Student)o2;
//         if (stu1.getroll()<stu2.getroll()){
//             return (-1);
//         }else{
//             return(1);
//         }        
//     }
// }