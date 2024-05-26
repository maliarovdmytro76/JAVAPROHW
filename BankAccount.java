public class BankAccount {

        private String owner;
        private double balance;

                public BankAccount(String owner, double initialBalance) {
            this.owner = owner;
            if (initialBalance >= 0) {
                this.balance = initialBalance;
            } else {
                this.balance = 0;
            }
        }
        public void deposit(double amount) {
            if (amount > 0) {
                balance += amount;
                System.out.println("Deposited: " + amount);
            } else {
                System.out.println("Deposit amount must be positive.");
            }
        }
        public void withdraw(double amount) {
            if (amount > 0 && amount <= balance) {
                balance -= amount;
                System.out.println("Withdrew: " + amount);
            } else if (amount > balance) {
                System.out.println("Insufficient funds. Transaction canceled.");
            } else {
                System.out.println("Withdraw amount must be positive.");
            }
        }
        public double getBalance() {
            return balance;
        }
        public String getOwner() {
            return owner;
        }
        public void setOwner(String newOwner) {
            if (newOwner != null && !newOwner.isEmpty()) {
                owner = newOwner;
                System.out.println("Owner name updated to: " + owner);
            }
        }
        public static void main(String[] args) {
            BankAccount account1 = new BankAccount("Alice", 500.00);
            BankAccount account2 = new BankAccount("Bob", 300.00);


            account1.deposit(200.00);
            account1.withdraw(100.00);
            System.out.println("Balance of " + account1.getOwner() + ": " + account1.getBalance());

            account2.deposit(150.00);
            account2.withdraw(450.00);
            System.out.println("Balance of " + account2.getOwner() + ": " + account2.getBalance());
        }
    }
