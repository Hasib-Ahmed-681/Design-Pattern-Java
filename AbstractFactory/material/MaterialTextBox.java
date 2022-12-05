package AbstractFactory.material;

import AbstractFactory.TextBox;

public class MaterialTextBox implements TextBox {
    @Override
    public void render() {
        System.out.println("Material Textbox");
    }
}
