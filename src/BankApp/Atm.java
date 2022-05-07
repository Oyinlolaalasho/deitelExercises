package BankApp;


import java.util.Scanner;


public class Atm {
    private static final Scanner scanner = new Scanner(System.in);
    private static final Bank zuBank = new Bank("zuBank", 20);
           public static void main (String[] args) {
               runApp();

           }

    private static void runApp() {
        String prompt = """
                Welcome to ZuBank,
                Press Softly
                1 -> To create account.
                2 -> To put money.
                3 -> To commot money.
                4 -> To send urgent 2h.
                5 -> To check Balance.
                6 -> To exit.
                """;
        System.out.println(prompt);
        String userResponse = scanner.nextLine();
        switch (userResponse) {
            case "1" -> createAccount();
            case "2" -> putMoney();
            case "3" -> commotMoney();
            case "4" -> sendUrgent2h();
            case "5" -> checkBalance();
            case "6" -> exit();
            default -> runApp();
        }
    }

    private static void exit() {
        System.exit(0);
    }

    private static void checkBalance() {
        System.out.println("Wetin be ya account number biko");
        String accountNumber = scanner.nextLine();
        System.out.println("ya needle");
        String pin = scanner.next();

        Accounting account = zuBank.findAccount(Integer.parseInt(accountNumber));
        System.out.println();
        System.out.println("New balance is " + account.getBalance(pin));
        System.out.println();
        scanner.next();
        runApp();

    }

    private static void sendUrgent2h() {
        System.out.println("Wetin be ya account number biko");
        String senderAccountNumber = scanner.nextLine();
        System.out.println("Babe's which account");
        String receiverAccountNumber = scanner.nextLine();
        System.out.println("ya needle");
        String pin = scanner.next();
        System.out.println("How mush");
        int amount = scanner.nextInt();

        zuBank.transfer(amount, senderAccountNumber, receiverAccountNumber, pin);
        Accounting account = zuBank.findAccount(Integer.parseInt(senderAccountNumber));

        System.out.println();
        System.out.println(account);
        System.out.println();
        scanner.next();
        runApp();
    }

    private static void commotMoney() {
        System.out.println("Which account");
        String accountNumber = scanner.nextLine();
        System.out.println("Wey needle");
        String pin = scanner.next();
        System.out.println("How mush");
        int amount = scanner.nextInt();
        zuBank.withdrawal(amount, accountNumber, pin);

        System.out.println("Success!!!");
        Accounting account = zuBank.findAccount(Integer.parseInt(accountNumber));
        System.out.println();
        System.out.println("New balance is " + account.getBalance(pin));
        System.out.println();
        scanner.next();
        runApp();
    }

    private static void putMoney() {
        System.out.println("Which account");
        String accountNumber = scanner.nextLine();
        Accounting account = zuBank.findAccount(Integer.parseInt(accountNumber));
        System.out.println("The name is " + account.getFullName());
        System.out.println("How much");
        int amount = scanner.nextInt();
        zuBank.deposit(amount, accountNumber);

        System.out.println();
        System.out.println(account);
        System.out.println();
        scanner.next();
        runApp();

    }

    private static void createAccount() {
        System.out.println("Enter yur real name");
        String firstName = scanner.nextLine();
        System.out.println("Enter your Papa name");
        String lastName = scanner.nextLine();
        System.out.println("Wey needle");
        String pin = scanner.nextLine();
        System.out.println();
        System.out.println();
        Accounting savedAccount =zuBank.createAccountFor(firstName,lastName,pin);
        System.out.println(savedAccount);
        System.out.println();
        System.out.println();
        scanner.next();
        runApp();
    }
}
