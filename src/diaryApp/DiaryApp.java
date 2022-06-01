package diaryApp;

import java.util.Scanner;

public class DiaryApp {
    private static final Scanner scanner = new Scanner(System.in);
    private static final Diary oyinDiary = new Diary("OyinDiary", "1234");

    public static void main(String[] args) {
        runApp();
    }

    private static void runApp() {
        System.out.println("""
                1. create account
                2. log in
                3. create entry
                4. search for entry
                5. number of entries
                6. delete
                7. delete all
                """);

        int userInput = scanner.nextInt();
        switch (userInput) {
            case 1 -> createDiary();
            case 2 -> logIn();
            case 3 -> createEntry();
//            case 4 -> search();
//            case 5 -> numberOfEntries();
//            case 6 -> delete();
//            case 7 -> deleteAll();
//            default -> menu();
        }
    }

    private static void createEntry() {
        System.out.println("what is the title of your entry");
        String title = scanner.next();
        scanner.nextLine();

        System.out.println("talk to the diary");
        String body = scanner.nextLine();

//        oyinDiary = new Diary();



    }

    private static void logIn() {
        System.out.println("enter your first name");
        String firstName = scanner.next();
        scanner.nextLine();

        System.out.println("Enter your last name");
        String lastName = scanner.next();
        scanner.nextLine();

        System.out.println("Input your password");
        String password = scanner.nextLine();

        String name = firstName + " " + lastName;

        Diary oyinDiary = new Diary(name, password);
        oyinDiary.isLock(password);

        System.out.println("welcome back " + name);
    }
    private static void createDiary() {
        System.out.println("Enter your first name");
        String firstName = scanner.next();
        scanner.nextLine();

        System.out.println("Enter your last name");
        String lastName = scanner.next();
        scanner.nextLine();

        System.out.println("Input your password");
        String password = scanner.nextLine();

        String name = firstName + " " + lastName;

        System.out.println("you have successfully created a Diary Account");
        Diary oyinDiary = new Diary(name, password);
        System.out.println(oyinDiary);
        System.out.println();
        System.out.println();

    }
}


//    static Scanner input = new Scanner(System.in);
//    static MyDiary diary;
//
//    public static void main(String[] args) {
//        menu();
//    }
//
//
//    public static void menu() {
//        System.out.println("""
//                1. create account
//                2. log in
//                3. create entry
//                4. search for entry
//                5. number of entries
//                6. delete
//                7. delete all
//                """);
//        int userInput = input.nextInt();
//        switch (userInput) {
//            case 1 -> createAccount();
//            case 2 -> logIn();
//            case 3 -> createEntry();
//            case 4 -> search();
//            case 5 -> numberOfEntries();
////            case 6 -> delete();
////            case 7 -> deleteAll();
//            default -> menu();
//        }
//    }
//
//    private static void search() {
//        diary = new MyDiary();
//        System.out.println("enter the title: ");
//        String title = input.next();
//        diary.findEntryByTitle(title);
//    }
//
//    private static void numberOfEntries() {
//        diary = new MyDiary();
//        createEntry();
//        System.out.println(diary.getNoOfEntries());
//    }
//
//    private static void createEntry() {
//        System.out.println("what is the title of your entry: ");
//        String title = input.next();
//        input.nextLine();
//
//        System.out.println("enter your secrets: ");
//        String secret = input.nextLine();
//
//        diary = new MyDiary();
//        diary.createEntry(title,secret);
//
//        System.out.println("title: " +title);
//        System.out.println("secret: " + secret);
//
//        menu();
//    }
//
//    private static void logIn() {
//        System.out.println("enter you first name: ");
//        String firstName = input.next();
//        input.nextLine();
//
//        System.out.println("enter your last name: ");
//        String secondName = input.next();
//        input.nextLine();
//
//        System.out.println("enter your password: ");
//        String password = input.nextLine();
//
//        String name = firstName + " " + secondName;
//
//        MyDiary diary = new MyDiary(name, password);
//        diary.unlockDiary(password);
//
//        System.out.println("welcome back  " + name);
//    }
//
//    private static void createAccount() {
//        System.out.println("enter your first name: ");
//        String firstName = input.next();
//        input.nextLine();
//
//        System.out.println("enter your last name: ");
//        String secondName = input.next();
//        input.nextLine();
//
//        System.out.println("enter your password: ");
//        String password = input.nextLine();
//
//        String name = firstName + " " + secondName;
//
//        System.out.println("you have successfully created an account");
//        MyDiary diary = new MyDiary(name, password);
//        System.out.println(diary);
//        System.out.println();
