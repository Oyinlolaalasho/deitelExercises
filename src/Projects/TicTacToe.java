package Projects;

public class TicTacToe {

    public static void main(String[] args) {

        int[][] array = {{2,3}, {2,3}};


        //    char[][] board = new char[5][5];
        int sum = 0;
        for( int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++) {

                sum += array[i][j];
            }
        }
        System.out.print(sum);
    }


}