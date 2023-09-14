package JavaFundamentals.JavaClasses.Interfaces;

public class Interfaces implements Interface {

    @Override
    public void display() {
        System.out.println(age);
    }

    public static void main(String[] args) {
        Interfaces interfaces = new Interfaces();
        interfaces.display();
    }
}
