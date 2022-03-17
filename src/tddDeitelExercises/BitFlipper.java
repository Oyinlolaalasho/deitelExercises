import java.util.Scanner;

public class BitFlipper {

    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Input a number: ");
        int inputNumber = input.nextInt();

        if (inputNumber == 1){
            System.out.print(0);
        }
        if (inputNumber == 0){
            System.out.print(1);
        }

    }
}
