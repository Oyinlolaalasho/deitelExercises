package tddDeitelExercises;

import java.util.Scanner;

public class DaysOfChristmas {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
//            int a = 0, b = 0, c = 0, d = 0;
        for (int i = 1; i <= 12; i++) {
//
            switch (i) {
                case 1 -> System.out.println("On the first day of Christmas my true love sent to me");
                case 2 -> System.out.println("On the second day of Christmas my true love sent to me");
                case 3 -> System.out.println("On the third day of Christmas my true love sent to me");
                case 4 -> System.out.println("On the fourth day of Christmas my true love sent to me");
                case 5 -> System.out.println("On the fifth day of Christmas my true love sent to me");
                case 6 -> System.out.println("On the sixth day of Christmas my true love sent to me");
                case 7 -> System.out.println("On the seventh day of Christmas my true love sent to me");
                case 8 -> System.out.println("On the eight day of Christmas my true love sent to me");
                case 9 -> System.out.println("On the ninth day of Christmas my true love sent to me");
                case 10 -> System.out.println("On the tenth day of Christmas my true love sent to me");
                case 11 -> System.out.println("On the eleventh day of Christmas my true love sent to me");
                case 12 -> System.out.println("On the twelfth day of Christmas my true love sent to me");
            }

            switch(i){
                   case 12:
                       System.out.println("twelve drummers drumming");
                   case 11:
                       System.out.println("eleven pipers piping");
                   case 10:
                       System.out.println("ten lords a-leaping");
                   case 9:
                       System.out.println("nine ladies dancing");
                   case 8:
                       System.out.println("eight maids a-milking");
                   case 7:
                       System.out.println("seven swans a-swimming");
                   case 6:
                       System.out.println("six geese a-laying");
                   case 5:
                       System.out.println("five gold rings");
                   case 4:
                       System.out.println("four calling birds");
                   case 3:
                       System.out.println("Three French hens");
                   case 2:
                       System.out.println("Two turtle doves");
                   case 1:
                       System.out.println("A partridge in a pear tree");
               }






//                System.out.printf("Enter Student%d grade: ", days);
//                String grade = input.nextLine();


        }
    }
}

