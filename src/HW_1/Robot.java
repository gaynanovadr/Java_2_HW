package HW_1;

public class Robot implements Moveable{
    private final int maxRun = 10;
    private final int maxJump = 5;
    private boolean check = true;

    public boolean isCheck() {
        return check;
    }

    @Override
    public void jump(int height) {
        if (maxJump >= height && check) {
            System.out.println("Robot can jump");
        } else {
            System.out.println("Robot cant jump");
            check = false;
        }
    }
    @Override
    public void run(int length) {
        if (maxRun >= length && check) {
            System.out.println("Robot can run");
        } else {
            System.out.println("Robot cant run");
            check = false;
        }
    }
}
