package AbstractFactory.ant;

import AbstractFactory.Button;
import AbstractFactory.TextBox;
import AbstractFactory.WidgetFactory;

public class AntWidgetFactory implements WidgetFactory {

    @Override
    public Button createButton() {
        return new AntButton();
    }

    @Override
    public TextBox createTextBox() {
        return new AntTextBox();
    }
}
