package JavaFundamentals.JavaClasses.Encapsulation;

public class Area {
    // fields to calculate area
    int length, breadth;

    // constructor to initialize values
    Area(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // method to calculate area
    public void getArea() {
        int area = this.length * this.breadth;
        System.out.println("Area: " + area);
    }
}
