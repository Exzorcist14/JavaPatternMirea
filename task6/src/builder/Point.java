package builder;

public class Point {
    public int x;
    public int y;
    public int speed;

    public Point(int x, int y, int speed) {
        this.x = x;
        this.y = y;
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                ", speed=" + speed +
                '}';
    }
}
