package state;

public class Canvas {
    private Tool currentTool;

    public void MouseDown(){
        currentTool.MouseDown();
    }

    public void MouseUp(){
        currentTool.MouseUp();
    }

    public Tool getCurrentTool() {
        return currentTool;
    }

    public void setCurrentTool(Tool currentTool) {
        this.currentTool = currentTool;
    }
}
