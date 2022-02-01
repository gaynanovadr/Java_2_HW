package HW_1;

public class Cat implements Moveable{
    private final int maxRun = 8;
    private final int maxJump = 2;
    private boolean check = true;

    public boolean isCheck() {
        return check;
    }

    @Override
    public void jump(int height) {
        if (maxJump >= height && check) {
            System.out.println("Cat can jump");
        } else {
            System.out.println("Cat cant jump");
            check = false;
        }
    }

    @Override
    public void run(int length) {
        if (maxRun >= length && check) {
            System.out.println("Cat can run");
        } else {
            System.out.println("Cat cant run");
            check = false;
        }
    }
}
