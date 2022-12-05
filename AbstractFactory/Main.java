package AbstractFactory;

import AbstractFactory.app.ContactForm;
import AbstractFactory.material.MaterialWidgetFactory;

public class Main {
    public static  void main(String[] args){
        new ContactForm().render(new MaterialWidgetFactory());

    }
}
