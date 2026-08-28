import java.util.Scanner;

public class BankApplication {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of accounts to create");
        int numberofAccounts = sc.nextInt();
        sc.nextLine();
        Bank[] bankAccounts = new Bank[numberofAccounts];
        for (int i = 0; i < numberofAccounts; i++) {
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
            System.out.println("Enter the Opening Balanc: ");
            double balance = sc.nextDouble();
            bankAccounts[i] = new Bank(bankName, userId, userName, accountNumber, accountType,
                    balance);

        }
        double amount;
        Bank b = null;
        int choice;
        do {
            System.out.println("1. Display complete Details" + "\n2. Deposit Amount" + "\n3. Withdraw Amount"
                    + "\n4. Check Balance" + "\n5. Display Account Summary" + "\n6. Check Minimum Balance"
                    + "\n0. Exit");
            System.out.print("Enter the choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    b.displayBankDetails();
                    b.displayUserDetails();
                    b.displayAccountDetails();

                    break;
                case 2:
                    System.out.println("Enter the deposit amount");
                    double depamount = sc.nextDouble();
                    boolean check = b.deposit(depamount);
                    if (check) {
                        System.out.println("Deposit successfull" + "\nThe updated amount: " + b.checkBalance());
                    } else {
                        System.out.println("deposit faild");
                    }

                    break;
                case 3:
                    System.out.println("Enter the withdrawl amount: ");
                    amount = sc.nextDouble();
                    boolean withdrawamount = b.withdraw(amount);

                    if (withdrawamount) {
                        System.out.println("Withdraw successfull" + "The Remaining Balance: " + b.checkBalance());
                    } else {
                        System.out.println("withdraw faid");
                    }

                    break;
                case 4:

                    System.out.println("Current Balance: " + b.checkBalance());
                    break;
                case 5:
                    String summary = b.createAccountSummary();
                    System.out.println(summary);
                    break;
                case 6:
                    System.out.println("Enter the minimumBalance");
                    double minimumBalance = sc.nextDouble();
                    boolean checkMinimumBalance = b.hasMinimumBalance(minimumBalance);
                    if (checkMinimumBalance) {
                        System.out.println("Mininum balance is maintained.");
                    } else {
                        System.out.println("Minimum balance is not maintained.");
                    }
                    break;
                case 0:
                    System.out.println("Thanks for using our application");
                    break;
                default:
                    System.out.println("Invalid- choice Enter again: ");

            }
        } while (choice != 0);

        sc.close();

    }
}
