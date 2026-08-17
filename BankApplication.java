import java.util.Scanner;

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
        String sumarry = "Bank Name:" + bankName + "\n User Name: " + userName + "\n Account Number: " + accountNumber
                + "\n Account Type" + accountType + "\n Balance" + balance;
        return sumarry;
    }

    boolean hasMinimumBalance(double minimumBalance) {
        boolean result = false;
        if (balance > minimumBalance) {
            result = true;
        }
        return result;
    }

}

class BankApplication {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the BankName: ");
        String bankName = sc.nextLine();
        System.out.println("Enter the UserId: ");
        int userId = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the UserName: ");
        String userName = sc.nextLine();
        System.out.println("Enter the accountNumber : ");
        long accountNumber = sc.nextLong();
        sc.nextLine();
        System.out.println("Enter the account type: ");
        String accountType = sc.nextLine();
        System.out.println("Enter the OpeningBalanc: ");
        double balance = sc.nextDouble();
        System.out.println("Enter the minimumBalance: ");
        double minimumBalance = sc.nextDouble();
        Bank b = new Bank(bankName, userId, userName, accountNumber, accountType,
                balance);
        b.displayBankDetails();
        b.displayUserDetails();
        b.displayAccountDetails();
        b.createAccountSummary();
        boolean checkMinimumBalance = b.hasMinimumBalance(minimumBalance);
        if (checkMinimumBalance) {
            System.out.println("Mininum balance is maintained.");
        } else {
            System.out.println("Minimum balance is not maintained.");
        }
        sc.close();
    }
}
