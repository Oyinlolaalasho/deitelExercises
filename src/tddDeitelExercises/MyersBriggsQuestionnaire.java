package tddDeitelExercises;

import java.util.Scanner;

public class MyersBriggsQuestionnaire {
    static Scanner input = new Scanner(System.in);
    private static int column1A;
    private static int column1B;
    private static int column2A;
    private static int column2B;
    private static int column3A;
    private static int column3B;
    private static int column4A;
    private static int column4B;
    private static String column1;
    private static String column2;
    private static String column3;
    private static String column4;


    public static void main(String[] args) {
        question();
        print(getColumn1());
        print(getColumn2());
        print(getColumn3());
        print(getColumn4());
    }
    public static void print(String message) {
        System.out.println(message);
    }
    public static void question() {
        for (int question = 0; question <= 20; question++) {
            switch (question) {
                case 1 -> {
                    print("""
                                                A           \t                B                \n
                            1 -> expend energy, enjoy groups\t  conserve energy, enjoy one-on-one
                            """);
                    String option = input.nextLine();
                    answerColumn1(option);
                }
                case 2 -> {
                    print("""
                                                A           \t               B                \n
                            2 -> interpret literally        \t  look for meaning and possibilities
                            """);
                    String option = input.nextLine();
                    answerColumn2(option);
                }
                case 3 -> {
                    print("""
                                                A           \t               B                \n
                            3 -> logical, thinking, questioning\t  empathetic, feeling, accommodating
                            """);
                    String option = input.nextLine();
                    answerColumn3(option);
                }
                case 4 -> {
                    print("""
                                                A           \t               B                \n
                            4 -> organized, orderly         \t       flexible, adaptable
                            """);
                    String option = input.nextLine();
                    answerColumn4(option);
                }
                case 5 -> {
                    print("""
                                                A           \t               B                \n
                            5 -> more outgoing, think out loud\t  more reserved, think to yourself
                            """);
                    String option = input.nextLine();
                    answerColumn1(option);
                }
                case 6 -> {
                    print("""
                                                A           \t               B                \n
                            6 -> practical, realistic, experiential\t  imaginative, innovative, theoretical
                            """);
                    String option = input.nextLine();
                    answerColumn2(option);
                }
                case 7 -> {
                    print("""
                                                A           \t               B                \n
                            7 -> candid, straight forward, frank\t  tactful, kind, encouraging
                            """);
                    String option = input.nextLine();
                    answerColumn3(option);
                }
                case 8 -> {
                    print("""
                                                A           \t               B                \n
                            8 ->        plan, schedule        \t  unplanned, spontaneous
                            """);
                    String option = input.nextLine();
                    answerColumn4(option);
                }
                case 9 -> {
                    print("""
                                                A           \t               B                \n
                            9 -> seek many tasks, public activities\t  seek private, solitary activities with quiet to
                                 interaction with others           \t  concentrate
                            """);
                    String option = input.nextLine();
                    answerColumn1(option);
                }
                case 10 -> {
                    print("""
                                                A           \t               B                \n
                            10 -> standard, usual, conventional\t  different, novel, unique
                            """);
                    String option = input.nextLine();
                    answerColumn2(option);
                }
                case 11 -> {
                    print("""
                                                A           \t                      B                \n
                            11 -> firm, tend to criticize, hold the line\tgentle, tend to appreciate, conciliate
                            """);
                    String option = input.nextLine();
                    answerColumn3(option);
                }
                case 12 -> {
                    print("""
                                                A           \t               B                \n
                            12 -> regulated, structured     \t  easygoing, "live" and "let live"
                            """);
                    String option = input.nextLine();
                    answerColumn4(option);
                }
                case 13 -> {
                    print("""
                                                A           \t                              B                \n
                            13 -> external, communicative, express yourself\t  internal, reticent, keep to yourself
                            """);
                    String option = input.nextLine();
                    answerColumn1(option);
                }
                case 14 -> {
                    print("""
                                                A           \t               B                \n
                            14 -> focus on here-and-now     \t  look to the future, global perspective, "big picture"
                            """);
                    String option = input.nextLine();
                    answerColumn2(option);
                }
                case 15 -> {
                    print("""
                                                A           \t               B                \n
                            15 -> tough-minded, just        \t  tender-hearted, merciful
                            """);
                    String option = input.nextLine();
                    answerColumn3(option);
                }
                case 16 -> {
                    print("""
                                                A           \t               B                \n
                            16 -> preparation, plan ahead        \t  go with the flow, adapt as you go
                            """);
                    String option = input.nextLine();
                    answerColumn4(option);
                }
                case 17 -> {
                    print("""
                                                A           \t               B                \n
                            17 -> active, initiate        \t  reflective, deliberate
                            """);
                    String option = input.nextLine();
                    answerColumn1(option);
                }
                case 18 -> {
                    print("""
                                                A           \t               B                \n
                            18 -> facts, things, "what is"        \t  ideas, dreams, "what could be," philosophical
                            """);
                    String option = input.nextLine();
                    answerColumn2(option);
                }
                case 19 -> {
                    print("""
                                                A           \t               B                \n
                            19 -> matter of fact, issue-oriented        \t  sensitive, people-oriented, compassionate
                            """);
                    String option = input.nextLine();
                    answerColumn3(option);
                }
                case 20 -> {
                    print("""
                                                A           \t               B                \n
                            20 -> control, govern           \t  latitude, freedom
                            """);
                    String option = input.nextLine();
                    answerColumn4(option);
                }
                }
        }
    }
    public static void answerColumn1(String option) {
        if (option.equalsIgnoreCase("A")) column1A++;
        else {
            if (option.equalsIgnoreCase("B"))
                column1B++;
        }
    }

    private static void answerColumn2(String option) {
        if (option.equalsIgnoreCase("A")) column2A++;
        else {
            if (option.equalsIgnoreCase("B")) column2B++;
        }
    }

    private static void answerColumn3(String option) {
        if (option.equalsIgnoreCase("A")) column3A++;
        else {
            if (option.equalsIgnoreCase("B")) column3B++;
        }

    }

    private static void answerColumn4(String option) {
        if (option.equalsIgnoreCase("A")) column4A++;
        else{
            if(option.equalsIgnoreCase("B")) column4B++;
        }
    }
    private static String getColumn1(){
        if (column1A > column1B) {
            column1 = "Extrovert\t";
        }
        else {
            if (column1A < column1B) column1 = "Introvert\t";
        }
        return column1;
    }
    private static String getColumn2(){
        if (column2A > column2B) {
            column2 = "Sensors\t";
        }
        else {
            if (column2A < column2B) column2 = "Intuitive\t";
        }
        return column2;
    }
    private static String getColumn3(){
        if (column3A > column3B) {
            column3 = "Thinkers\t";
        }
        else {
            if (column3A < column3B) column3 = "Feelers\t";
        }
        return column3;
    }
    private static String getColumn4(){
        if (column4A > column4B) {
            column4 = "Judging\t";
        }
        else {
            if (column4A < column4B) column4 = "Perceiving\t";
        }
        return column4;
    }
}