package builder;

public class ConcreteBuilder implements Builder{
    private int x;
    private int y;
    private int speed;

    @Override
    public Point build() {
        return new Point(x,y,speed);
    }

    @Override
    public void setX(int x) {
        this.x = x;
    }

    @Override
    public void setY(int y) {
        this.y = y;
    }

    @Override
    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
