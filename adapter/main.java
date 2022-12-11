package adapter;

import adapter.avaFilters.Caramel;

public class main {
    public static void main(String[] args){
          var imageview= new ImageView(new Image());
          imageview.apply(new CaramelFilter(new Caramel()));
    }
}
