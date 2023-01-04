package factory.matcha;

import java.util.Map;

public interface ViewEngine {
    String render(String view, Map<String, Object> context);
}
