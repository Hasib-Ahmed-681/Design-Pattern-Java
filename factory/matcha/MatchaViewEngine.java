package factory.matcha;

import java.util.Map;

public class MatchaViewEngine implements ViewEngine {
    @Override
    public String render(String view, Map<String, Object> context)
    {
        return "view rendered by Matcha";
    }
}
