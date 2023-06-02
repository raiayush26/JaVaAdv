class Student {
    private String name;
    private int age;
    private String rollNumber;
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }
    public String getRollNumber() {
        return rollNumber;
    }
    public void displayInfo() {
        System
            .out
            .println("Name: " + name);
        System
            .out
            .println("Age: " + age);
        System
            .out
            .println("Roll Number: " + rollNumber);
    }
}
// Main class
public class EncapsulationDemo {
    public static void main(String[]args) {
        // Create an object of the Student class
        Student student = new Student();
        // Set values using setter methods
        student.setName("John Doe");
        student.setAge(20);
        student.setRollNumber("ABC123");
        // Display student information using the displayInfo method
        student.displayInfo();
        // Access information using getter methods
        String name = student.getName();
        int age = student.getAge();
        String rollNumber = student.getRollNumber();
        System
            .out
            .println("Name: " + name);
        System
            .out
            .println("Age: " + age);
        System
            .out
            .println("Roll Number: " + rollNumber);
    }
}
