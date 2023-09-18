package JavaFundamentals.JavaClasses.Abstraction;

public class Abstraction {
    public static void main(String[] args) {
        Car car = new Suzuki();
        car.accelerate();
        Bank bank;
        bank = new Citi(); // concrete class object
        System.out.println("Citi Rate of Interest is: " + bank.getInterestRate() + "%");
        bank = new HSBC();  // concrete class object
        System.out.println("HSBC Rate of Interest is: " + bank.getInterestRate() + "%");
    }
}
