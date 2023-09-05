package JavaFundamentals.JavaMethods;

import java.util.Scanner;


public class SampleDrill {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double toothPaste = 15.50, noodles = 20, carnenorte = 39.75, total1 = 0 , total2 = 0, total3 = 0;
        int itemQty1,itemQty2,itemQty3;
        String itemName1,itemName2,itemName3;

        System.out.print("Input Item name: ");
        itemName1= input.nextLine();
        System.out.print("Input quantity: ");
        itemQty1 = input.nextInt();
        input.nextLine();
        total1 = toothPaste * itemQty1;

        System.out.print("Input Item name: ");
        itemName2 = input.nextLine();
        System.out.print("Input quantity: ");
        itemQty2 = input.nextInt();
        input.nextLine();
        total2 = noodles * itemQty2;

        System.out.print("Input Item name: ");
        itemName3 = input.nextLine();
        System.out.print("Input quantity: ");
        itemQty3 = input.nextInt();
        input.nextLine();
        total3 = carnenorte * itemQty3;

        System.out.println("\nItem name\tQuantity\tTOTAL");
        System.out.printf("%s\t\t%d\t\t%.2f",itemName1,itemQty1,total1);
        System.out.printf("\n%s\t\t%d\t\t%.2f",itemName2,itemQty2,total2);
        System.out.printf("\n%s\t\t%d\t\t%.2f",itemName3,itemQty3,total3);

    }
}
