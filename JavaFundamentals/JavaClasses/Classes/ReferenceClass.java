package JavaFundamentals.JavaClasses.Classes;

class Student {
    int age;
    String name;
}
public class ReferenceClass {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        student1.name = "Alberth One";
        student1.age = 25;
        student2.name = "Alberth Two";
        student2.age = 25;

        System.out.println("Student 1: Name: " + student1.name + " Age: " + student1.age);
        System.out.println("Student 2: Name: " + student2.name + " Age: " + student2.age);

    }
}
