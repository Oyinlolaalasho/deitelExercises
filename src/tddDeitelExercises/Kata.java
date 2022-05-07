
package tddDeitelExercises;

public class Kata {

    private boolean isEven;

    public int add(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public int subtract(int firstNumber, int secondNumber) {
        int result = 0;
        if (secondNumber > firstNumber) {
            result = secondNumber - firstNumber;
        }
        if (firstNumber > secondNumber) {
            result = firstNumber - secondNumber;
        }
        return result;
    }

    public int testDriller(int copies) {
        int result = 0;
        if (copies >= 1 && copies <= 4) result = copies * 2000;
        if (copies >= 5 && copies <= 9) result = copies * 1800;
        if (copies >= 10 && copies <= 29) result = copies * 1600;
        if (copies >= 30 && copies <= 49) result = copies * 1500;
        if (copies >= 50 && copies <= 99) result = copies * 1300;
        if (copies >= 100 && copies <= 199) result = copies * 1200;
        if (copies >= 200 && copies <= 499) result = copies * 1100;
        if (copies >= 500) result = copies * 1000;

        return result;
    }

    public int quotient(int firstNumber, int secondNumber) {
        int result = 0;
        if (firstNumber > secondNumber) {
            result = firstNumber / secondNumber;
        }
        if (secondNumber > firstNumber) {
            result = secondNumber / firstNumber;
        }
        return result;
    }

    public boolean isEven(int status) {
        return status % 2 == 0;
    }

    public int maximumNumber(int num1, int num2, int num3, int num4, int num5) {

        int num = 0;
        if (num1 > num) num = num1;
        if (num2 > num) num = num2;
        if (num3 > num) num = num3;
        if (num4 > num) num = num4;
        if (num5 > num) num = num5;
        System.out.println(num);
        return num;
    }


    public int factor(int number) {
        int i = 1;
        int count = 0;
//        for (i = 1; i<=number; i++){
//            if(number%i == 0)
//                count++;
//        }
//
//        return count;
        while (i <= number) {
            if (number % i == 0) {
                count++;
            }
            i++;
        }
        return count;
    }

    public boolean primeNumber(int number) {
        boolean result = false;
        int i = 1;
        int count = 0;
        while (i <= number) {
            if (number % i == 0) {
                count++;
            }
            i++;
        }
        if (count <= 2) result = true;
        return result;
    }

    public static int getMaximumNumber(int[] number) {
        int maximum = 0;
        for (int i = 0; i < number.length; i++) {
            if (number[i] > maximum) maximum = number[i];
//            sum += number[i];
        }
        return maximum;
    }

    public static int sumOfArrays(int[] number) {
        int sum = 0;
        int maximum = 0;
        for (int i = 0; i < number.length; i++) {
            if (number[i] > maximum) maximum = number[i];
            sum += number[i];
        }
        return sum;
    }

    public static int minimumNUmberInArrays(int[] number) {
        int minimum = 0;
        for (int i = 0; i < number.length; i++) {
            if (minimum > number[i]) minimum = number[i];

        }
        return minimum;
    }
}




//    public int maxiNumber(int num1, int num2, int num3, int num4, int num5) {
//        int num = 1;
//        for (num = 1; num <= 5; num++){
//            if(num5 > num) num = num5;
//            if(num4 > num) num = num4;
//            if(num3 > num) num = num3;
//            if(num2 > num) num = num2;
//            if(num1 > num) num = num1;
//            System.out.println(num);
//        }
//        return num;
//    }
//}
//        if (num1 < num2) return num2;
//        if (num1 < num3) return num3;
//        if (num1 < num4) return num4;
//        if (num1 < num5) return num5;
//
//        if (num2 < num1) return num1;
//        if (num2 < num3) return num3;
//        if (num2 < num4) return num4;
//        if (num2 < num5) return num5;
//
//
//        if (num3 < num1) return num1;
//        if (num3 < num2) return num2;
//        if (num3 < num4) return num4;
//        if (num3 < num5) return num5;
//
//        if (num4 < num1) return num1;
//        if (num4 < num2) return num2;
//        if (num4 < num3) return num3;
//        if(num4 < num5) return num5;
//
//        if(num5 < num1) return num1;
//        if(num5 < num2) return num2;
//        if(num5 < num3) return num3;
//        if(num5 < num4) return num4;
//        return num1;


//    public int getResult() {
//        return result;
//    }
//
//    public void setResult(int result) {
//        this.result = result;
//    }


    //public void palindrome(int fiveDigitNumber) {
//       if ()
//        return false;
    // }

    // public Boolean result() {
    //     return null;


//    public Boolean result() {
//        return false;
//    }
//
//    public void result(int num1, int num2, int num3, int num4, int num5) {
//         boolean result = false;
//
//         if (num1 != num5 )
//
//         if (num1 == num2)
//             result = false;
//         if (num1 == num5) {
//             result = true;
//        }
//    }
//
//    public void palindrome(int num) {
//        if (num == num);
//    }

    // The method takes in an integer with 5 

    //public int subtract(int i, int i1) {

    //}

    //public int

