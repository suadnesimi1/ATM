import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int balance = 100;
        int withdraw;
        int deposit;
        int yes = 1;
        Scanner s = new Scanner(System.in);
        System.out.println("Welcome to our Bank ATM");
        System.out.println("Please select one of the following options to continue!");
        System.out.println("\n 1.Withdraw\n 2.Deposit\n 3.Balance\n 4.Exit\n");
        int choice = s.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("How much money you will take");
                    withdraw = s.nextInt();
                    if (balance >= withdraw) {
                        balance = balance - withdraw;
                        System.out.println("Take your money");
                    } else {
                        System.out.println("Error transaction");
                    }
                    switch (choice) {
                        case 1:
                            System.out.println("Do you want to continue\nType 1 for yes or 0 for No");
                            yes = s.nextInt();
                            if (yes == 1) {
                                System.out.println("\n 1.Withdraw\n 2.Deposit\n 3.Balance\n 4.Exit\n");
                                choice = s.nextInt();
                                switch (choice) {
                                    case 1:
                                        System.out.println("How much money you will take");
                                        withdraw = s.nextInt();
                                        if (balance >= withdraw) {
                                            balance = balance - withdraw;
                                            System.out.println("Take your money");
                                        } else {
                                            System.out.println("Error transaction");
                                        }
                                        break;
                                    case 2:
                                        System.out.println("How much money you want to deposit");
                                        deposit = s.nextInt();
                                        if ((balance >= deposit) || (balance <= deposit)) {
                                            balance = balance + deposit;
                                            System.out.println("Succefully transaction");

                                        } else {
                                            System.out.println("Error transaction");
                                        }
                                        break;
                                    case 3:
                                        System.out.println("Your total balance: " + balance);
                                        break;
                                    case 4:
                                        System.out.println("Exit");
                                        break;
                                    default:
                                        System.out.println("Wrong Choice, Please select of the options to continue");
                                }
                            } else {
                                break;
                            }
                            System.out.println("\nYou can perfom maximum two transactions in a time.\nPlease take your card and try it again later!");

                            break;
                    }
                    break;
            }

            switch (choice) {
                case 2:
                    System.out.println("How much money you want to deposit");
                    deposit = s.nextInt();
                    if ((balance >= deposit) || (balance <= deposit)) {
                        balance = balance + deposit;
                        System.out.println("Succefully transaction");

                    } else {
                        System.out.println("Error transaction");
                    }
                    break;
            }
            switch (choice) {
                case 3:
                    System.out.println("Your total Balance " + balance);

                    break;
            }
            switch (choice) {
                case 4:
                    System.out.println("Enter " + 0 + " to Exit");
                    break;
            }

            }
        }


