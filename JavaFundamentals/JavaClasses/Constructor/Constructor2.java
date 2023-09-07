package JavaFundamentals.JavaClasses.Constructor;

class Sample2 {
    int age;
    String name;
    Sample2(int ages, String names) {
        age = ages;
        name = names;
    }

    public void printRecord() {
        System.out.println("Name: " + name + " Age: " + age);
    }
}
public class Constructor2 {
    public static void main(String[] args) {
        Sample2 sample2 = new Sample2(25,"Alberth G. Ruado");
        sample2.printRecord();
    }
}
