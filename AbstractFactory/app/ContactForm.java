package AbstractFactory.app;


import AbstractFactory.WidgetFactory;


public class ContactForm {
    public void render(WidgetFactory factory){

        factory.createButton().render();
        factory.createTextBox().render();
    }
}
