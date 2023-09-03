package JavaFundamentals.JavaClasses.Classes;

class Account {
    int acc_no;
    double amount;
    String name;

    public void insertAccount(int acc_nos, double amounts, String names) {
        acc_no = acc_nos;
        amount = amounts;
        name = names;
    }

    // deposit method
    public void deposit(double amount_deposit) {
        amount+=amount_deposit;
        System.out.println("Amount deposit: " + amount_deposit);
    }

    // withdraw method
    public void withdraw(double amount_withdraw){
        if (amount < amount_withdraw) {
            System.out.println("Insufficient Balance");
        } else {
            amount -= amount_withdraw;
            System.out.println("Amount withdraw: " + amount_withdraw);
        }
    }

    // check balance method
    public void checkBalance() {
        System.out.println("Account balance: " + amount);
    }

    // view account method
    public void viewAccountRecord() {
        System.out.println(acc_no + " " + amount + " " + name);
    }
}
public class ClassAccount {
    public static void main(String[] args) {
        Account account1 = new Account();
        System.out.println("\nReal World Example\n");
        account1.insertAccount(101, 1000, "Alberth G. Ruado");
        account1.deposit(400000);
        account1.withdraw(1000);
        account1.checkBalance();
        account1.viewAccountRecord();

    }
}
