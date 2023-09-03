package JavaFundamentals.JavaClasses.Classes;

class Rectangle {
    int length, width;
    public void insert(int len, int wid) {
        length = len;
        width = wid;
    }

    public void calculateArea() {
        System.out.println(length * width);
    }
}
public class CreateTwoObject {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(), r2 = new Rectangle();
        r1.insert(11,5);
        r2.insert(3,15);

        r1.calculateArea();
        r2.calculateArea();
    }
}
