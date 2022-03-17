package tddDeitelExercises;

import java.util.Scanner;

public class Nokia {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        NokiaMenu phone = new NokiaMenu();

        System.out.println("press ok to go to Menu");
        String response = input.next();


                int menu = phone.menu();
                switch(menu){
                    case 1:
                        phone.phoneBook();
                        break;
                    case 2:
                        phone.messages();
                        break;
    }
}
                //phone.phoneBook(phone.menu());

}
