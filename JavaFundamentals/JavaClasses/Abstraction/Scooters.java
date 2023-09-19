package JavaFundamentals.JavaClasses.Abstraction;

public class Scooters extends Vehicle {
    @Override
    void start() {
        System.out.println("Scooters start");
    }

    @Override
    void stop() {
        System.out.println("Scooters stop");
    }

    @Override
    void accelerate() {
        System.out.println("Scooters accelerate");
    }

    @Override
    void brake() {
        System.out.println("Scooters brake");
    }
}
