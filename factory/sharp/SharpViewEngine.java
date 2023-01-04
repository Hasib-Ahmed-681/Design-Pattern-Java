package factory.sharp;

import factory.matcha.ViewEngine;

import java.util.Map;

public class SharpViewEngine implements ViewEngine {
    @Override
    public String render(String view, Map<String, Object> context) {
        return "viwe rendered by sharp";
    }
}
