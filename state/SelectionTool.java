package state;

public class SelectionTool implements Tool{
    @Override
    public void MouseDown() {
        System.out.println("Selection Icon");
    }

    @Override
    public void MouseUp() {
        System.out.println("draw a dashed rectangle");
    }
}
