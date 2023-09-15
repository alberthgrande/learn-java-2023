package JavaFundamentals.JavaClasses.Inheritance;

public class Bicycle {

    public int gear;
    public int speed;

    public Bicycle(int gear, int speed) {
        this.gear = gear;
        this.speed = speed;
    }

    public void applyBreaks(int decrement) {
            speed -= decrement;
    }

    public void applySpeed(int increment) {
        speed += increment;
    }

    public String toString() {
        return ("No of gears are " + this.gear + "\n" +
                "speed of bicycle is " + this.speed);
    }

}
