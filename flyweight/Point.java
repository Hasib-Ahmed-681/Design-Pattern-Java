package flyweight;

public class Point {
    private int x;
    private int y;
    private PointType type;
    private byte[] icon;

    public Point(int x, int y, PointType type, byte[] icon) {
        this.x = x;
        this.y = y;
        this.type = type;
        this.icon = icon;
    }

    public void draw(){
        System.out.printf("%s at (%d,%d)",type,x,y);

    }
}
