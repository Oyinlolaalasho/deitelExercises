package tddDeitelExercises;

public class BarChartPrinter {

    public int printer(int num) {

            for (int i = 0; i < num; i++) {

                for (int k = 0; k < num; k++) {
                    System.out.print(" ");
                }
                for (int k = 0; k < num; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        return num;
    }
//    private boolean isThirty(){
//        return printer(num);
//    }
//
//    public boolean getResult() {
//        if(printer(int num) < 30 && printer(int num) > 1);
//        return false;
//    }
}
