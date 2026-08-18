import java.util.Scanner;

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
