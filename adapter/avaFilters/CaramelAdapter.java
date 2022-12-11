package adapter.avaFilters;

import adapter.Filter;
import adapter.Image;

public class CaramelAdapter extends  Caramel implements Filter {
    @Override
    public void apply(Image image) {
        init();
        render(image);
    }
}
