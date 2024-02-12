import java.util.Scanner;

public class atm {
    private double balance = 0;

    public atm(double initialBalance) {
        balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit successful. New balance: Peso " + balance);
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds. Withdrawal failed.");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: Peso " + balance);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        atm atm = new atm(0.0); 

       
        while (true) {
            System.out.println("\nATM Menu:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

           
            int type = scanner.nextInt();

           
            switch (type) {
                case 1:
                   
                    System.out.println("Current Balance: Peso " + atm.getBalance());
                    break;
                case 2:
                 
                    System.out.print("Enter deposit amount: Peso ");
                    double depositAmount = scanner.nextDouble();
                    atm.deposit(depositAmount);
                    break;
                case 3:
                   
                    System.out.print("Enter withdrawal amount: Peso ");
                    double withdrawalAmount = scanner.nextDouble();
                    atm.withdraw(withdrawalAmount);
                    break;
                case 4:
                   
                    System.out.println("Exiting ATM. Thank you!");
                    System.exit(0);
                    break;
                default:
                    
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}
