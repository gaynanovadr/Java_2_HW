package HW_1;

public class Main {
    public static void main(String[] args) {
        Cat cat1=new Cat();
        Wall wall = new Wall(3);
        cat1.jump(wall.getHeight());

        Moveable [] moveables = new Moveable[] {new Cat(), new Human(), new Robot()}; //массив с участниками
        Obstacles [] obstacles = new Obstacles[] {new Wall(2), new Track(8)}; // массив с препятсвиями

        for (Moveable move : moveables) {
             for (Obstacles obst : obstacles) {
                 obst.doObstacles(move);
            }
        }

    }
}
