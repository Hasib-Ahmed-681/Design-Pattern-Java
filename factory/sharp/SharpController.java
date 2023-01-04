package factory.sharp;

import factory.matcha.Controller;
import factory.matcha.ViewEngine;

public class SharpController  extends Controller {
    protected ViewEngine createViewEngine() {
        return new SharpViewEngine();
    }
}
