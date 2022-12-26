package state;

public class BrushTool implements Tool{
    @Override
    public void MouseDown() {
        System.out.println("brush icon");
    }

    @Override
    public void MouseUp() {
        System.out.println("Draw a line");
    }
}
