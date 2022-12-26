//Open Closed Extension 
//Open for extention 
//Close for modification



package state;

public class Main {
    public static void main(String[] args)
    {
        var canvas= new Canvas();
        canvas.setCurrentTool(new BrushTool());
        canvas.MouseDown();
        canvas.MouseUp();
    }
}
