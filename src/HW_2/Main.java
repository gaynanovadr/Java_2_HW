package HW_2;

public class Main {
    public static void main(String[] args) {
        String[][] array = new String[][]{
                {"1", "2", "7", "0"},
                {"0", "3", "6", "4"},
                {"3", "6", "1", "5"},
                {"5", "0", "7", "k"},
        };
        try {
            System.out.println(checkArray(array));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static int checkArray(String[][] array) throws MyArrayDataException, MyArraySizeException {
        for (int i = 0; i < array.length; i++) {
            if (array.length != 4 || array[i].length != 4) {
                throw new MyArraySizeException();
            }
        }
        int totalSum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    totalSum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        return totalSum;
    }
}
