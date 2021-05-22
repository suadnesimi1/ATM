import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        int balance = 100; // declaration of variable and assign value
        int withdraw; // declaration of variable
        int deposit; // declaration of variable
        int yes = 1; // declaration of variable and assign value
        Scanner s = new Scanner(System.in); //scanner class is to get user input
        System.out.println("Welcome to our Bank ATM"); // print this line
        System.out.println("Please select one of the following options to continue!");//print this line
        System.out.println("\n 1.Withdraw\n 2.Deposit\n 3.Balance\n 4.Exit\n");// print this line to selecet one of them
        int choice = s.nextInt(); // nextInit() method used to scan token of the input integer
        // read for switch statement to understand code
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
                while (true) {
                    System.out.println("Take your card");
                    break;
                }
        }
        switch (choice) {
            case 2:
                System.out.println("How much money you want to deposit");
                deposit = s.nextInt();
                if ((balance >= deposit) || (balance <= deposit)) {
                    balance = balance + deposit;
                    System.out.println("Successfully transaction");
                    System.out.println("You deposit: "+deposit);
                } else {
                    System.out.println("Error transaction");
                }
                while (true) {
                    System.out.println(" Do you want to continue? Type\n Yes =1, No =0");
                    yes = s.nextInt();
                    if (yes == 1) {
                        System.out.println("\n 1.Withdraw\n 2.Deposit\n 3.Balance\n 4.Exit");
                        choice = s.nextInt();
                        switch (choice) {
                            case 1:
                                System.out.println("How much money you withdraw?");
                                withdraw = s.nextInt();
                                if (balance >= withdraw) {
                                    balance = balance - withdraw;
                                    System.out.println("Take your money");
                                    System.out.println("You withdraw: "+withdraw);
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
                                    System.out.println("You deposit: "+deposit);

                                } else {
                                    System.out.println("Error transaction");
                                }

                                break;
                            case 3:
                                System.out.println("Your total balance: " + balance);
                                System.out.println("Take your card");
                            case 4:
                                System.out.println("Exit");
                                break;
                            default:
                                System.out.println("Wrong Choice, Please select of the options to continue");
                                break;

                        }
                    } else {
                        System.out.println("Take your card");
                        break;
                    }
                    break;
                }
                break;
        }

        switch (choice) {
            case 3:
                System.out.println("Your total Balance " + balance);
                while (true) {
                    System.out.println("WAnt to continue? Yes =1, No =0");
                    yes = s.nextInt();
                    if (yes == 1) {
                        System.out.println("\n 1.Withdraw\n 2.Deposit\n 3.Balance\n 4.Exit");
                        choice = s.nextInt();
                        switch (choice) {
                            case 1:
                                System.out.println("How much money you will take");
                                withdraw = s.nextInt();
                                if (balance >= withdraw) {
                                    balance = balance - withdraw;
                                    System.out.println("Take your money");
                                    System.out.println("Your balance now is: "+balance);
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
                                    System.out.println("You deposit: "+deposit);
                                    System.out.println("Your balance now is: "+balance);
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
                        System.out.println("Take your card");

                        break;
                    }
                    break;

                }
                break;
        }


        switch (choice) {
            case 4:
                System.out.println("Enter " + 0 + " to Exit");
                System.out.println("Take your card\n\n\n");
                System.out.println("Have a nice day");
                break;
        }

    }

}



