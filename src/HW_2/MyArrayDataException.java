package HW_2;

public class MyArrayDataException extends Exception {

    public MyArrayDataException(int i, int j) {
        super("Problem in element: [" + i + "]" + "[" + j + "]");
    }
}
