import java.util.Scanner;

public class bank {
    public static void main(String[] args) {

        int balance = 1000, deposit, withdraw, num; // initializing the variables //

        try (Scanner sc = new Scanner(System.in)) {
            System.out.printf("Enter your password: ");
            int pass = sc.nextInt();
            int flag = 1; // initialising flag using for only once for the menu part //
            if (pass == 159) {
                System.out.println("Hii Nayan Welcome to your Account");
            } else {
                flag++;
                System.out.println("Invalid Password");
            }
            if (flag == 1) {
                menu();
                while (true) {
                    num = sc.nextInt();

                    switch (num) {
                        case 1:
                            System.out.printf("Enter the Amount to withdraw: ");
                            withdraw = sc.nextInt();
                            if (balance >= withdraw) {
                                balance = balance - withdraw;
                                System.out.println("Balance Amount:  " + balance);
                            } else {
                                System.out.println("Not having enough money.   \n");
                            }
                            break;

                        case 2:
                            System.out.printf("Enter the Amount to Deposit: ");
                            deposit = sc.nextInt();
                            balance = balance + deposit;
                            System.out.println("Balance Amount: " + balance);
                            System.out.println("Money has been deposited successfully.  \n");
                            break;

                        case 3:
                            System.out.println("Your Account Balance is:    \n" + balance);
                            break;

                        case 4:
                            System.exit(0);

                    }
                    sc.close();
                }
            }
        }
    }

    public static void menu() {
        System.out.println("1. WITHDRAW");
        System.out.println("2. DEPOSIT");
        System.out.println("3. CHECK BALANCE");
        System.out.println("4. EXIT");
    }

}
