package JavaFundamentals.JavaClasses.Polymorphism;

public class Polymorphism {
    public static void main(String[] args) {
        Bike bike;
        bike = new Splendor(); // upcasting
        bike.run();
        bike = new Honda3();
        System.out.println("Speed Limit: " + bike.speedLimit);


        System.out.println();


        Bank bank;
        bank = new Bank();
        System.out.println(bank.getRateOfInterest());
        bank = new SBI();
        System.out.println(bank.getRateOfInterest());
        bank = new ICICI();
        System.out.println(bank.getRateOfInterest());
        bank = new AXIS();
        System.out.println(bank.getRateOfInterest());

        System.out.println();

        Shape shape;
        shape = new Shape();
        shape.draw();
        shape = new Rectangle();
        shape.draw();
        shape = new Circle();
        shape.draw();
        shape = new Triangle();
        shape.draw();

    }
}
