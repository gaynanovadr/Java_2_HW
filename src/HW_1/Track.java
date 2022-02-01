package HW_1;

public class Track implements Obstacles{
    private int length;

    public Track(int length) {
        this.length = length;
    }
    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public void doObstacles(Moveable moveable) {
        moveable.run(length);
    }
}
