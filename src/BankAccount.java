
   import java.util.Scanner; //allows us to read input from user

    public class BankAccount {
        private double balance; //double variable to store account balance

        public BankAccount(double initialBalance) {  //constructor that takes an initial balance parameter and initializes balance variable with that value
            balance = initialBalance; //sets initial balance when anew object is created
        }

        public void deposit(double amount) {  //method to deposit that takes deposit amount as a parameter
            if (amount > 0) {
                balance += amount;
                System.out.println("Deposited: $" + amount);
            } else {
                System.out.println("Invalid deposit amount.");
            }
        }

        public void withdraw(double amount) { //method to withdraw that takes amount as parameter
            if (amount > 0 && amount <= balance) {
                balance -= amount;
                System.out.println("Withdrawn: $" + amount);
            } else if (amount <= 0) {
                System.out.println("Invalid withdrawal amount.");
            } else {
                System.out.println("Insufficient balance.");
            }
        }

        public double getBalance() { //method to retrieve account balance
            return balance;
        }
//program execution starts
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter initial balance: $");
            double initialBalance = scanner.nextDouble();

            BankAccount account = new BankAccount(initialBalance);

            while (true) {
                System.out.println("Current balance: $" + account.getBalance());
                System.out.print("Enter 1 to deposit, 2 to withdraw, or 3 to exit: ");
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1: {
                        System.out.print("Enter deposit amount: $");
                        double depositAmount = scanner.nextDouble();
                        account.deposit(depositAmount);
                    }
                    case 2: {
                        System.out.print("Enter withdrawal amount: $");
                        double withdrawalAmount = scanner.nextDouble();
                        account.withdraw(withdrawalAmount);
                    }
                    case 3: {
                        System.out.println("Exiting program.");
                        scanner.close();
                        System.exit(0);
                    }
                    default: System.out.println("Invalid choice. Try again.");
                }
            }
        }
    }

