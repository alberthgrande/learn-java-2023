package JavaFundamentals.JavaClasses.Constructor;

class Sample3 {
    int age, id;
    String name;

    Sample3(int ID, String NAME) {
        id = ID;
        name = NAME;
    }

    Sample3(int ID, String NAME, int AGE) {
        id = ID;
        name = NAME;
        age = AGE;
    }

    public void display() {
        System.out.println("ID: " + id + " Name: " + name + " Age: " + age);

    }
}
public class Constructor3 {
    public static void main(String[] args) {
        Sample3 sample3 = new Sample3(101,"Alberth G. Ruado");
        Sample3 sample4 = new Sample3(101,"Alberth G. Ruado", 25);
        sample3.display();
        sample4.display();

    }
}
