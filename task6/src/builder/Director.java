package builder;

public class Director
{
    private Builder builder;
    public Director(Builder builder){
        this.builder = builder;
    }
    public Point createPoint(){
        this.builder.setX(5);
        this.builder.setY(4);
        this.builder.setSpeed(10);
        return this.builder.build();
    }
}
