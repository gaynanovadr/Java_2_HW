package HW_1;

public class Human implements Moveable{
    private final int maxRun = 5;
    private final int maxJump = 1;
    private boolean check = true;

    public boolean isCheck() {
        return check;
    }

    @Override
    public void jump(int height) {
        if (maxJump >= height && check) {
            System.out.println("Human can jump");
        } else {
            System.out.println("Human cant jump");
            check = false;
        }
    }
    @Override
    public void run(int length) {
        if (maxRun >= length && check) {
            System.out.println("Human can run");
        } else {
            System.out.println("Human cant run");
            check = false;
        }
    }
}
