package JavaFundamentals.JavaClasses.Classes;

class Employee {
    int id;
    double salary;
    String name;

    public void insertRecord(int ids, double salarys, String names) {
        id = ids;
        salary = salarys;
        name = names;
    }

    public void viewRecord() {
        System.out.println(id + " " + salary + " " + name);
    }
}
public class ClassesThree {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        Employee employee3 = new Employee();
        System.out.println("Employee Records");
        employee1.insertRecord(101, 101000, "Alberth G. Ruado");
        employee2.insertRecord(102, 102000, "Alberth G. Ruado");
        employee3.insertRecord(103, 103000, "Alberth G. Ruado");
        employee1.viewRecord();
        employee2.viewRecord();
        employee3.viewRecord();
    }
}
