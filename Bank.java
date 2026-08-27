
class Bank {
    String bankName;
    int userId;
    String userName;
    long accountNumber;
    String accountType;
    double balance;

    Bank(String banknName, int userId, String userName, long accountNumber, String accountType,
            double balance) {
        this.bankName = banknName;
        this.userId = userId;
        this.userName = userName;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;

    }

    void displayBankDetails() {
        System.out.println("Bank Name: " + bankName);
    }

    void displayUserDetails() {
        System.out.println("User Id: " + userId);
        System.out.println("user Name: " + userName);
    }

    void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Type: " + accountType);
        System.out.println("Current Balance: " + balance);

    }

    String createAccountSummary() {
        String sumarry = "Bank Name: " + bankName + "\n User Name: " + userName + "\n Account Number: " + accountNumber
                + "\n Account Type: " + accountType + "\n Balance: " + balance;
        return sumarry;
    }

    boolean hasMinimumBalance(double minimumBalance) {
        boolean result = false;
        if (balance >= minimumBalance) {
            result = true;
        }

        return result;
    }

    boolean deposit(double amount) {
        boolean check = false;
        if (amount > 0) {
            balance += amount;
            check = true;
        }
        return check;
    }

    boolean withdraw(double amount) {
        boolean check = false;
        if (amount > 0 && amount <= balance) {
            if (amount <= balance) {
                this.balance = balance - amount;
                check = true;
            }
        }

        return check;
    }

    double checkBalance() {
        return balance;
    }

    void displayCompleteDetails() {
        displayBankDetails();
        displayUserDetails();
        displayAccountDetails();
    }

    boolean matchesAccountNumber(long searchAccountNumber) {
        return this.accountNumber == searchAccountNumber;
    }

}