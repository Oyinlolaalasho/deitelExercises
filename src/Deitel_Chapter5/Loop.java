package Deitel_Chapter5;

import java.security.SecureRandom;
import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        int count = 0;
        SecureRandom random = new SecureRandom();
        Scanner scanner = new Scanner(System.in);
        for(;count<=100;){

            System.out.println("Enter a score or enter anything more than 100 to exit");
            count = scanner.nextInt();
            System.out.println("AsherFlo");
//            count = random.nextInt(7); //random numbers generator value is 7
//            System.out.println("Count is"+ count);

        }
    }

}
