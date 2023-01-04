package factory;

import factory.matcha.Controller;
import factory.matcha.MatchaViewEngine;

import java.util.HashMap;
import java.util.Map;

public class ProductsController extends Controller {
    public void listProducs(){
        //get product form database;
    }

    Map<String,Object> context = new HashMap<>();
    //context.put(product)


    @Override
    public void render(String viewName, Map<String, Object> context) {
        super.render(viewName, context);
    }
}
