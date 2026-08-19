import java.util.Scanner;

public class BankApplication {

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
        System.out.println("Enter the Opening Balanc: ");
        double balance = sc.nextDouble();
        System.out.println("Enter the minimumBalance: ");
        double minimumBalance = sc.nextDouble();
        Bank b = new Bank(bankName, userId, userName, accountNumber, accountType,
                balance);

        double amount;

        int j = 1;
        do {
            System.out.println("1. Display complete Details" + "\n2. Deposit Amount" + "\n3. Withdraw Amount"
                    + "\n4. Check Balance" + "\n5. Display Account Summary" + "\n6. Check Minimum Balance"
                    + "\n0. Exit");
            System.out.print("Enter the choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    b.displayBankDetails();
                    b.displayUserDetails();
                    b.displayAccountDetails();
                    j++;
                    break;
                case 2:
                    System.out.println("Enter the deposit amount");
                    double depamount = sc.nextDouble();
                    boolean check = b.deposit(depamount);
                    if (check) {
                        System.out.println("Deposit successfull");
                    } else {
                        System.out.println("deposit faild");
                    }
                    j++;
                    break;
                case 3:
                    System.out.println("Enter the withdrawl amount: ");
                    amount = sc.nextDouble();
                    boolean withdrawamount = b.withdraw(amount);

                    if (withdrawamount) {
                        System.out.println("Withdraw successfull");
                    } else {
                        System.out.println("withdraw faid");
                    }
                    j++;
                    break;
                case 4:

                    System.out.println("Current Balance: " + b.checkBalance());
                    j++;
                    break;
                case 5:
                    String summary = b.createAccountSummary();
                    System.out.println(summary);
                    j++;
                    break;
                case 6:
                    boolean checkMinimumBalance = b.hasMinimumBalance(minimumBalance);
                    if (checkMinimumBalance) {
                        System.out.println("Mininum balance is maintained.");
                    } else {
                        System.out.println("Minimum balance is not maintained.");
                    }
                    j++;
                    break;
                case 0:
                    System.out.println("Thanks for using our application");
                    j = 0;
                    break;
                default:
                    System.out.println("Invalid- choice Enter again: ");
                    choice = sc.nextInt();
                    j++;
            }
        } while (j >= 1);

        sc.close();

    }
}
