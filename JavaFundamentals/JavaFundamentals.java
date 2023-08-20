package JavaFundamentals;

public class JavaFundamentals {
    public void basicSyntax() {

        System.out.println("// single line comment" +
                "\n" +
                "/* multiline comment */" +
                "\n");
    }

    public void dataTypesVariables() {
        System.out.println("Variable Declaration:" +
                "\n" +
                "int count;" +
                "\n" +
                "int => type" +
                "\n" +
                "cout => name" +
                "\n");
        System.out.println("Variable Initialization:" +
                "\n" +
                "count = 100;" +
                "\n" +
                "Combination of declaration and initializaion" +
                "\n" +
                "int count = 100;" +
                "\n");

        System.out.println("Types of variables" +
                "\n" +
                "Local Variables" +
                "\n" +
                "Instance Variables" +
                "\n" +
                "Static Variables");
    }

    public void primitiveDataTypes() {
        System.out.println("Integer data types" +
                "\n" +
                "byte (1 byte)\n" +
                "short (2 bytes)\n" +
                "int (4 bytes)\n" +
                "long (8 bytes)");
        System.out.println("Floating Data Type" +
                "\n" +
                "float (4 bytes)\n" +
                "\n" +
                "double (8 bytes)");
        System.out.println("Textual Data Type" +
                "\n" +
                "char (2 bytes)");
        System.out.println("Logical" +
                "\n" +
                "boolean (1 byte) (true/false)");
    }

    public void typeCasting() {
        double d;
        int i = 10;
        d = i;

        System.out.println(i);
        System.out.println(d);

        byte x;
        int a = 270;
        double b = 128.128;
        System.out.println("int converted to byte");
        x = (byte) a;
        System.out.println("a and x " + a + " " + x);
        System.out.println("double converted to int");
        a = (int) b;
        System.out.println("b and a " + b + " " + a);
        System.out.println("\ndouble converted to byte");
        x = (byte)b;
        System.out.println("b and x " + b + " " + x);
    }
}
