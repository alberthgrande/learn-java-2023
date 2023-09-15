package JavaFundamentals.JavaClasses.Inheritance;

public class MoutainBike extends Bicycle {
    public int seatHeight;

    public MoutainBike(int gear, int speed, int startHeight) {
        // invoking base-class(Bicycle) constructor
        super(gear,speed);
        seatHeight = startHeight;
    }

    public void setHeight(int newValue) {
        seatHeight = newValue;
    }

    // overriding toString() method
    // of Bicycle to print more info
    @Override
    public String toString() {
        return (super.toString() + "\n seat height is " + this.seatHeight);
    }
}
