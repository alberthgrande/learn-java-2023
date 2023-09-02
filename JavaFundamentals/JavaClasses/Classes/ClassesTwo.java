package JavaFundamentals.JavaClasses.Classes;

class instanceOfClass {
    int age;
    String name;
}
public class ClassesTwo {
    public static void main(String[] args) {
        instanceOfClass obj = new instanceOfClass();
        obj.age = 25;
        obj.name = "Alberth G. Ruado";
        System.out.println("Age: " + obj.age + "\nName: " + obj.name);
    }
}
