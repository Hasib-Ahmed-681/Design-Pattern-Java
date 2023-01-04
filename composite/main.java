package composite;

public class main {
    public static void main(String[] args){
        var group1=new Group();
        group1.add(new Shape()); // squre
        group1.add(new Shape()); // squre

        var group2=new Group();
        group2.add(new Shape()); // circle
        group2.add(new Shape()); // circle

        var group=new Group();
        group.add(group1);
        group.add(group2);
        group.render();
        group.move();
    }
}
