package JavaMethods;

public class MemoryAllocationMethodsCalls {
    // define instance of variables
    private int age;
    private String name;

    // define the accessor (getter) methods
    public int getAge(){ return age; }
    public String getName() { return name; }

    // define mutator (setter) methods
    public void setAge (int age) {
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }

    // difine other methods
    public void printDetails() {
        System.out.println("Age: " + this.getAge());
        System.out.println("Name: " + this.getName());
    }

    public static void main(String[] args) {
        MemoryAllocationMethodsCalls memoryAllocationMethodsCalls = new MemoryAllocationMethodsCalls();
        memoryAllocationMethodsCalls.setAge(25);
        memoryAllocationMethodsCalls.setName("Alberth G. Ruado");
        memoryAllocationMethodsCalls.printDetails();
    }
}
