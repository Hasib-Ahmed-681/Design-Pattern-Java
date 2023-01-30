package Prototype;

public class Circle implements Component{
    private int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void render() {
        System.out.println("Rendering Circle");
    }

    @Override
    public Component clone() {

        Circle newCircle= new Circle();
        newCircle.setRadius(radius);
        return newCircle;

    }
}
