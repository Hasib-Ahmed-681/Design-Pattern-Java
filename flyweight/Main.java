package flyweight;

public class Main {
    public static void main(String[] args){
        var service = new PointService();
        for(var point: service.getPoints())
            point.draw();
    }
}
