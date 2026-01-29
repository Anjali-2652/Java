import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class BankAmt{
    double balance;   //variable to store money in account
    public double depositAmt(double amount){
        balance = balance + amount;    //add amount to balance
        System.out.println("Deposited amount is: " + amount);
        return  balance;
    }

    public double withdrawAmt(double amount){
        if(amount <= balance){
            balance -= amount;   // subtract amount from balance
            System.out.println("Withdrawn amount is :" +amount);
        }else{
            System.out.println("Insufficient Balance");
        }
        return  balance;
    }

    public double totalAmt(){
        System.out.println("Total Amount is :" +balance);
        return  balance;
    }

}


public class Main {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        BankAmt account = new BankAmt();
        account.balance = 0;

        while(true){
            System.out.println("\n -----Bank Account Menu-----");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Show Balance");
            System.out.println("4. Exit");
            System.out.println("Choose an option:");

            int choice = sc.nextInt();

            if(choice == 1){
                System.out.println("Enter deposit amount: ");
                double amt = sc.nextDouble();
                account.depositAmt(amt);
            } else if (choice ==2) {
                System.out.println("Enter withdrawal amount:");
                double amt = sc.nextDouble();
                account.withdrawAmt(amt);
            } else if (choice == 3) {
                account.totalAmt();

            } else if (choice == 4) {
                System.out.println("Exiting.... Thank You!!");

            }else {
                System.out.println("Invalid Choice!");
            }
        }

    }
}