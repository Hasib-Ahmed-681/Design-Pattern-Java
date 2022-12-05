package AbstractFactory.ant;

import AbstractFactory.TextBox;

public class AntTextBox implements TextBox {
    @Override
    public void render() {
        System.out.println("Ant Textbox");
    }
}
