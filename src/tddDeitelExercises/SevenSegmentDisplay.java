package tddDeitelExercises;

public class SevenSegmentDisplay {

    String[][] array = new String[5][4];
    public void setA(){
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 4; j++) {
                array[i][j] = "* ";
            }
        }
    }

    public void setB(){
        for (int i = 0; i < 3; i++) {
            for (int j = 3; j < 4 ; j++) {
                array[i][j] = "* ";
            }
        }
    }

    public void setC(){
        for (int i = 2; i < 5 ; i++) {
            for (int j = 3; j < 4; j++) {
                array[i][j] = "* ";
            }
        }
    }
    public void setD(){
        for (int i = 4; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                array[i][j] = "* ";
            }
        }
    }

    public void setE(){
        for (int i = 2; i < 5; i++) {
            for (int j = 0; j < 1; j++) {
                array[i][j] = "* ";
            }
        }
    }
    public void setF(){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 1; j++) {
                array[i][j] = "* ";
            }
        }
    }
    public void setG(){
        for (int i = 2; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                array[i][j] = "* ";
            }
        }
    }
    public void setForSpace(){
        for (int i = 0; i <= 4; i++) {
            for (int j = 0; j <= 3; j++) {
                array[i][j] = "  ";
            }
        }
    }
    public void printSegmentDisplay(String input){
        setForSpace();
        if(input.charAt(7) == '1'){
            if (input.charAt(0) == '1'){setA();}
            if (input.charAt(1) == '1'){setB();}
            if (input.charAt(2) == '1'){setC();}
            if (input.charAt(3) == '1'){setD();}
            if (input.charAt(4) == '1'){setE();}
            if (input.charAt(5) == '1'){setF();}
            if (input.charAt(6) == '1'){setG();}
        }
    }

    public  void printSegment(){
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(array[i][j]+ " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        SevenSegmentDisplay segmentDisplay = new SevenSegmentDisplay();
        segmentDisplay.printSegmentDisplay("11111111");
        segmentDisplay.printSegment();
    }
}

