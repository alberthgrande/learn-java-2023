package JavaFundamentals.JavaClasses.Abstraction;

public class Cars extends Vehicle {
    @Override
    void start() {
        System.out.println("Cars start");
    }

    @Override
    void stop() {
        System.out.println("Cars stop");
    }

    @Override
    void accelerate() {
        System.out.println("Cars accelerate");
    }

    @Override
    void brake() {
        System.out.println("Cars brake");
    }
}
