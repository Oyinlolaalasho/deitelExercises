package tddTasks;

public class HugeInteger {
        private int numberOfDigits;
                private static final int maxNumberOfDigits = 40;
        private final int[] intArray;

        public HugeInteger(int numberOfDigits) {
            if (numberOfDigits <= maxNumberOfDigits && numberOfDigits > 0) {
                intArray = new int[numberOfDigits];
            } else throw new RuntimeException("Value exceeded the maximum required array size;");
        }

        public static String add(HugeInteger hugeInteger1, HugeInteger hugeInteger2) {
            int h2Size = hugeInteger2.getSize();
            int h1Size = hugeInteger1.getSize();

            String result;
            if (h1Size > h2Size) {
                result = implementAdd(hugeInteger1, hugeInteger2, h2Size).toString();
            } else {
                result = implementAdd(hugeInteger2, hugeInteger1, h1Size).toString();
            }
            return result;
        }

        private static HugeInteger implementAdd(HugeInteger hugeInteger1, HugeInteger hugeInteger2, int h2Size) {
            int reminder = 0;
            for (int i = h2Size - 1; i >= 0; i--) {
                int x = hugeInteger1.getArrayElements()[i] + hugeInteger2.getArrayElements()[i] + reminder;
                if (x >= 10) {
                    hugeInteger1.getArrayElements()[i] = x - 10;
                    reminder = 1;
                } else {
                    hugeInteger1.getArrayElements()[i] = x;
                    reminder = 0;
                }
            }
            if (reminder != 0) {
                throw new RuntimeException("An overflow has occurred! Sum of the first digits is greater than 10!");
            }
            return hugeInteger1;
        }

        public static String subtract(HugeInteger hugeInteger1, HugeInteger hugeInteger2) {
            int h1Size = hugeInteger1.getSize();
            int h2Size = hugeInteger2.getSize();
            String result = "";
            if (h1Size > h2Size) {
                result = implementSubtraction(hugeInteger1, hugeInteger2, h2Size);
            } else {
                result = implementSubtraction(hugeInteger2, hugeInteger1, h1Size);
            }

            return result;

        }

        public static String implementSubtraction(HugeInteger hugeInteger1, HugeInteger hugeInteger2, int h2Size) {
            int borrow = 0;
            for (int i = h2Size - 1; i >= 0; i--) {
                int h1 = hugeInteger1.getArrayElements()[i];
                int h2 = hugeInteger2.getArrayElements()[i];
                if (h1 >= h2) {
                    hugeInteger1.getArrayElements()[i] = h1 - h2 + borrow;
                    borrow = 0;
                } else {
                    hugeInteger1.getArrayElements()[i] = h1 + 10 - h2 + borrow;
                    borrow = -1;
                }
            }
            if (borrow == -1) {
                throw new ArithmeticException("The output of the calculation is invalid!");
            }
            return hugeInteger1.toString();
        }


        public void parse(String value) {
            for (int i = 0; i < value.length(); i++) {
                switch (value.charAt(i)) {
                    case '0' -> intArray[i] = 0;
                    case '1' -> intArray[i] = 1;
                    case '2' -> intArray[i] = 2;
                    case '3' -> intArray[i] = 3;
                    case '4' -> intArray[i] = 4;
                    case '5' -> intArray[i] = 5;
                    case '6' -> intArray[i] = 6;
                    case '7' -> intArray[i] = 7;
                    case '8' -> intArray[i] = 8;
                    case '9' -> intArray[i] = 9;
                    default -> throw new RuntimeException("invalid digit was found!");
                }
                numberOfDigits++;
            }
        }

        public int getSize() {
            return numberOfDigits;
        }

        public int[] getArrayElements() {
            return intArray;
        }

        @Override
        public String toString() {
            StringBuilder sB = new StringBuilder();
            for (int i = 0; i < intArray.length; i++) {
                sB.append(intArray[i]);
            }
            return sB.toString();
        }

        public boolean isEqualTo(HugeInteger anotherHugeInteger) {
            int counter = 0;
            if (intArray.length != anotherHugeInteger.getArrayElements().length) {
                return false;
            }
            for (int i = 0; i < intArray.length; i++) {
                if (intArray[i] == anotherHugeInteger.getArrayElements()[i]) {
                    counter++;
                }
            }
            return counter == intArray.length;
        }

        public boolean isNotEqualTo(HugeInteger anotherHugeInteger) {
            return !isEqualTo(anotherHugeInteger);
        }


        public boolean isGreaterThan(HugeInteger anotherHugeInteger) {
            if (intArray.length > anotherHugeInteger.getSize()) {
                return true;
            } else if (intArray.length == anotherHugeInteger.getSize()) {
                if (intArray[0] > anotherHugeInteger.getArrayElements()[0]) {
                    return true;
                }
            }
            return false;
        }

        public boolean isLessThan(HugeInteger anotherHugeInteger) {
            if (intArray.length < anotherHugeInteger.getArrayElements().length) {
                return true;
            } else if (intArray.length == anotherHugeInteger.getSize()) {
                if (intArray[0] < anotherHugeInteger.getArrayElements()[0]) {
                    return true;
                }
            }
            return false;
        }

        public boolean isGreaterThanOrEqualTo(HugeInteger anotherHugeInteger) {
            if (intArray.length >= anotherHugeInteger.getSize()) {
                return true;
            } else if (intArray.length == anotherHugeInteger.getSize()) {
                if (intArray[0] >= anotherHugeInteger.getArrayElements()[0]) {
                    return true;
                }
            }
            return false;
        }

        public boolean isLessThanOrEqualTo(HugeInteger hugeInteger2) {
            return !isGreaterThanOrEqualTo(hugeInteger2);
        }
    }

