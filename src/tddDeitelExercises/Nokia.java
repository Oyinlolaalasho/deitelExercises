package tddDeitelExercises;

import java.util.Scanner;

public class Nokia {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        menuOption();

    }
    public static void menuOption(){
        System.out.println("Menu");
        System.out.println("""
                1. Phone Book
                2. Messages
                3. Chat
                4. Call register
                5. Tones
                6. Settings
                7. Call divert
                8. Games
                9. Calculator
                10. Reminders
                11. Clock
                12. Profiles
                13. SIM services
                """);
        System.out.print("Enter 1 to 13 to choose an option in menu: ");
        int menu = input.nextInt();
        switch (menu){
            case 1: phonebook();
            case 2: messages();
            case 3: chat();
            case 4: callRegister();
            case 5: tones();
            case 6: settings();
            case 7: callDivert();
            case 8: games();
            case 9: calulator();
            case 10: reminders();
            case 11: clock();
            case 12: profiles();
            case 13: simServices();
        }
    }

    private static void simServices() {
        System.out.println("SIM services");
        backToMenu();
    }

    private static void profiles() {
        System.out.println("Profiles");
        backToMenu();
    }

    private static void clock() {
        System.out.println("Clock");
        backToMenu();
    }

    private static void reminders() {
        System.out.println("Reminders");
        backToMenu();
    }

    private static void calulator() {
        System.out.println("Calculator");
        backToMenu();
    }

    private static void games() {
        System.out.println("Games");
        backToMenu();
    }

    private static void callDivert() {
        System.out.println("Call divert");
        backToMenu();
    }

    private static void settings() {
        System.out.println("Settings");
        System.out.println("""
                        1. Call settings
                        2. Phone settings
                        3. Security settings
                        4. Restore factory settings
                        5. Back
                        """);
        System.out.print("Enter a number from 1 to 5 for Settings menu: ");
        int settings = input.nextInt();
        switch(settings){
            case 1 -> callSettings();
            case 2 -> phoneSettings();
            case 3 -> securitySettings();
            case 4 -> restoreFactorySettings();
            case 5 -> backToMenu();
            default -> {System.out.println("Wrong Option");
                settings();}
        }
    }

    private static void restoreFactorySettings() {
        System.out.println("Restore Factory Settings");
        backToSettings();
    }

    private static void backToSettings() {
        settings();
    }

    private static void securitySettings() {
        System.out.println("Security Settings");
        backToSettings();
    }

    private static void phoneSettings() {
        System.out.println("Phone Settings");
        backToSettings();
    }

    private static void callSettings() {
        System.out.println("Call Settings");
        backToSettings();
    }

    private static void tones() {
        System.out.println("Tones");
        System.out.println("""
                        1. Ringing tone
                        2. Ringing volume
                        3. Incoming call alert
                        4. Composer
                        5. Message alert tone
                        6. Keypad tones
                        7. Warning and game tones
                        8. Vibrating alert
                        9. Screen saver
                        10. Back
                        """);
        System.out.print("Enter a number from 1 to 10 for Tones menu: ");
        int tones = input.nextInt();
        switch (tones) {
            case 1 -> ringingTone();
            case 2 -> ringingVolume();
            case 3 -> incomingCallAlert();
            case 4 -> composer();
            case 5 -> messageAlertTone();
            case 6 -> keypadTones();
            case 7 -> warningAndGameTones();
            case 8 -> vibratingAlert();
            case 9 -> screenSaver();
            case 10-> backToMenu();
            default -> {System.out.println("Wrong Option");
                tones();}
        }
    }

    private static void screenSaver() {
        System.out.println("Screen Saver");
        backToTones();
    }

    private static void vibratingAlert() {
        System.out.println("Vibrating Alert");
        backToTones();
    }

    private static void warningAndGameTones() {
        System.out.println("Warning And Game Tones");
        backToTones();
    }

    private static void keypadTones() {
        System.out.println("Keypad Tones");
        backToTones();
    }

    private static void messageAlertTone() {
        System.out.println("Message Alert Tone");
        backToTones();
    }

    private static void composer() {
        System.out.println("Composer");
        backToTones();
    }

    private static void incomingCallAlert() {
        System.out.println("Incoming Call Alert");
        backToTones();
    }

    private static void ringingVolume() {
        System.out.println("Ringing Volume");
        backToTones();
    }

    private static void ringingTone() {
        System.out.println("Ringing Tone");
        backToTones();
    }

    private static void backToTones() {
        tones();
    }

    private static void callRegister() {
        System.out.println("Call register");
        System.out.println("""
                        1. Missed calls
                        2. Received calls
                        3. Dialled numbers
                        4. Erase recent call lists
                        5. Show call duration
                        6. Show Call Costs
                        7. Call Cost Settings
                        8. Prepaid Settings
                        9. Back
                        """);
        System.out.print("Enter a number from 1 to 9 for Set menu: ");
        int callRegister = input.nextInt();
        switch (callRegister) {
            case 1 -> missedCalls();
            case 2 -> recievedCalls();
            case 3 -> dialledNumbers();
            case 4 -> eraseRecentCallLists();
            case 5 -> showCallDuration();
            case 6 -> showCallCosts();
            case 7 -> callCostSettings();
            case 8 -> prepaidCredit();
            case 9 -> backToMenu();
            default -> {System.out.println("Wrong Option");
                callRegister();}
        }

    }

    private static void prepaidCredit() {
        System.out.println("Prepaid credit");
        backToCallRegister();
    }

    private static void callCostSettings() {
        System.out.println("Call cost settings");
        System.out.println("""
                                1. Call cost limit
                                2. Show costs in
                                3. Back
                                """);
        System.out.print("Enter a number between 1 and 2 for Show call costs menu: ");
        int callCostSettings = input.nextInt();
        switch (callCostSettings) {
            case 1 -> System.out.println("Call cost limit");
            case 2 -> System.out.println("Show costs in");
            case 3 -> backToCallRegister();
            default -> {System.out.println("Wrong Option");
                callCostSettings();}
        }
    }

    private static void showCallCosts() {
        System.out.println("Show call costs");
        System.out.println("""
                                1. Last call cost
                                2. All calls' cost
                                3. Clear counters
                                4. Back
                                """);
        System.out.print("Enter a number from 1 to 3 for Show call costs menu: ");
        int showCallCosts = input.nextInt();
        switch (showCallCosts) {
            case 1 -> System.out.println("Last call cost");
            case 2 -> System.out.println("All calls' cost");
            case 3 -> System.out.println("Clear counters");
            case 4 -> backToCallRegister();
            default -> {System.out.println("Wrong Option");
                showCallCosts();}
        }
    }

    private static void showCallDuration() {
        System.out.println("Show Call Duration");
        System.out.println("""
                                1. Last call duration
                                2. All calls' duration
                                3. Received calls' duration
                                4. Dialled calls' duration
                                5. Clear timers
                                6. Back

                                """);
        System.out.print("Enter a number from 1 to 5 for Show call duration menu: ");
        int showCallDuration = input.nextInt();
        switch (showCallDuration) {
            case 1 -> System.out.println("Last call duration");
            case 2 -> System.out.println("All call's duration");
            case 3 -> System.out.println("Received calls' duration");
            case 4 -> System.out.println("Dialled calls' duration");
            case 5 -> System.out.println("Clear timers");
            case 6 -> backToCallRegister();
            default -> {System.out.println("Wrong Option");
                showCallDuration();}
        }
    }

    private static void eraseRecentCallLists() {
        System.out.println("Erase Recent Call Lists");
        backToCallRegister();
    }

    private static void dialledNumbers() {
        System.out.println("Dialled Numbers");
        backToCallRegister();
    }

    private static void backToCallRegister() {
        callRegister();
    }

    private static void recievedCalls() {
        System.out.println("Recieved Calls");
        backToCallRegister();
    }

    private static void missedCalls() {
        System.out.println("Missed Calls");
        backToCallRegister();
    }

    private static void chat() {
        System.out.println("Chat");
        backToMenu();
    }

    private static void messages() {
        System.out.println("Messages");
        System.out.println("""
                        1. Write messages
                        2. Inbox
                        3. Outbox
                        4. Picture messages
                        5. Templates
                        6. Smileys
                        7. Message settings
                        8. Info service
                        9. Voice mailbox number
                        10. Service command editor
                        11. Back
                        """);
        System.out.print("Enter a number from 1 to 11 for messages menu: ");
        int messages = input.nextInt();
        switch (messages) {
            case 1 -> writeMessage();
            case 2 -> inbox();
            case 3 -> outbox();
            case 4 -> pictureMessages();
            case 5 -> templates();
            case 6 -> smileys();
            case 7 -> messageSettings();
            case 8 -> informationService();
            case 9 -> voiceMailboxNumber();
            case 10 -> serviceCommandEditor();
            case 11 -> backToMenu();
            default -> {System.out.println("Wrong Option");
                messages();}
        }
    }

    private static void writeMessage() {
        System.out.println("Write Message");
        backToMessage();
    }

    private static void inbox() {
        System.out.println("Inbox");
        backToMessage();
    }

    private static void outbox() {
        System.out.println("Outbox");
        backToMessage();
    }

    private static void pictureMessages() {
        System.out.println("Picture Messages");
        backToMessage();
    }

    private static void templates() {
        System.out.println("Templates");
        backToMessage();
    }

    private static void smileys() {
        System.out.println("Smileys");
        backToMessage();
    }

    private static void serviceCommandEditor() {
        System.out.println("Service Command Editor");
        backToMessage();
    }

    private static void voiceMailboxNumber() {
        System.out.println("Voice Mailbox Number");
        backToMessage();
    }

    private static void informationService() {
        System.out.println("Information Service");
        backToMessage();
    }

    private static void messageSettings() {
        System.out.println("Message Settings");
        System.out.println("""
                                1. Set
                                2. Common
                                3. Back
                                """);
        System.out.print("Enter a number between 1 and 2 for Message settings menu: ");
        int messageSettings = input.nextInt();
        switch (messageSettings) {
            case 1 -> set();
            case 2 -> common();
            case 3 -> backToMessage();
            default -> {System.out.println("Wrong Option");
                messageSettings();}
        }
    }

    private static void set() {
        System.out.println("Set");
        System.out.println("""
                                        1. Message centre number
                                        2. Messages sent as
                                        3. Message validity
                                        4. Back
                                        """);
        System.out.print("Enter a number from 1 t0 4 for Set menu: ");
        int set = input.nextInt();
        switch (set) {
            case 1 -> System.out.println("Message centre number");
            case 2 -> System.out.println("Message sent as");
            case 3 -> System.out.println("Message validity");
            case 4 -> backToMessageSettings();
            default -> {System.out.println("Wrong Option");
                set();}
        }
    }

    private static void common() {
        System.out.println("Common");
        System.out.println("""
                                        1. Delivery reports
                                        2. Reply via same centre
                                        3. Character support
                                        4. Back
                                        """);
        System.out.print("Enter a number from 1 to 4 for Common menu: ");
        int common = input.nextInt();
        switch (common) {
            case 1 -> System.out.println("Delivery reports");
            case 2 -> System.out.println("Rely via same centre");
            case 3 -> System.out.println("Character support");
            case 4 -> backToMessageSettings();
            default -> {System.out.println("Wrong Option");
                common();}
        }
    }

    private static void backToMessageSettings() {
        messageSettings();
    }

    private static void backToMessage() {
        messages();
    }

    private static void phonebook() {
        System.out.println("PhoneBook");
        System.out.println("""
                        1. Search
                        2. Service Numbers
                        3. Add name
                        4. Erase
                        5. Edit
                        6. Assign tone
                        7. Send b'card
                        8. Options
                        9. Speed dials
                        10. Voice tags
                        11. Back
                        """);
        System.out.print("Enter a number from 1 to 11 for phone book menu: ");
        int phonebook = input.nextInt();
        switch (phonebook) {
            case 1 -> search();
            case 2 -> serviceNumber();
            case 3 -> addName();
            case 4 -> erase();
            case 5 -> edit();
            case 6 -> assignTone();
            case 7 -> sendBCard();
            case 8 -> option();
            case 9 -> speedDials();
            case 10 -> voiceTags();
            case 11 -> backToMenu();
            default -> {System.out.println("Wrong Option!!!");
                phonebook();}

        }
    }

    private static void backToMenu() {
        menuOption();
    }

    private static void voiceTags() {
        System.out.println(" voice Tags!!!");
        backToPhoneBook();
    }

    private static void speedDials() {
        System.out.println("speed Dials!!!");
        backToPhoneBook();
    }

    private static void option() {
        System.out.println("Option");
        System.out.println("""
                                1. Type of view
                                2. Memory status
                                3. Back
                                """);
        System.out.print("Enter a number from 1 to 3 for Options menu: ");
        int option = input.nextInt();
        switch (option) {
            case 1 -> System.out.println("Type of view!!!");
            case 2 -> System.out.println("Memory status!!!");
            case 3 -> backToPhoneBook();
            default -> {System.out.println("Wrong Option!!!");
                option();}
        }
    }

    private static void backToPhoneBook() {
        phonebook();
    }

    private static void sendBCard() {
        System.out.println("send B'card!!! ");
        phonebook();
    }

    private static void assignTone() {
        System.out.println(" Assign a tone!!! ");
        backToPhoneBook();
    }

    private static void edit() {
        System.out.println("edit a contact!!!");
        backToPhoneBook();
    }

    private static void erase() {
        System.out.println("erase a contact!!!");
        backToPhoneBook();
    }

    private static void addName() {
        System.out.println("add a name!!");
        backToPhoneBook();
    }

    private static void serviceNumber() {
        System.out.println("service Number!!!");
        backToPhoneBook();
    }

    private static void search() {
        System.out.println("Search!!!");
        backToPhoneBook();
    }
}

