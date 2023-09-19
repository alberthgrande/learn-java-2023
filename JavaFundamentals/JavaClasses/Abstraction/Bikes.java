package JavaFundamentals.JavaClasses.Abstraction;

public class Bikes extends Vehicle {
    @Override
    void start() {
        System.out.println("Bikes start");
    }

    @Override
    void stop() {
        System.out.println("Bikes stop");
    }

    @Override
    void accelerate() {
        System.out.println("Bikes accelerate");
    }

    @Override
    void brake() {
        System.out.println("Bikes brake");
    }
}
