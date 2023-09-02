package JavaFundamentals.JavaClasses.Classes;

class Students {
    String Name;
    int Age;
    public void insertRecord(String name, int age) {
        Name = name;
        Age = age;

    }
    public void displaRecord() {
        System.out.println("Student Record: Name: " + Name + " Age: " + Age);
    }

}

class MethodClass {
    public static void main(String[] args) {
        Students students1 = new Students();
        Students students2 = new Students();
        students1.insertRecord("Alberth Student One", 25);
        students2.insertRecord("Alberth Student Two", 26);
        students1.displaRecord();
        students2.displaRecord();
    }
}