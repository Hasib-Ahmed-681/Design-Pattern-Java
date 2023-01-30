package Itarator;

import java.util.ArrayList;
import java.util.List;

public class BrowseHistory {
    private List<String> urls= new ArrayList<>();


    public void push(String url)
    {
        urls.add(url);
    }

    public String pop()
    {
        int lastIndex=urls.size()-1;
        String lastUrls=urls.get(lastIndex);
        urls.remove(lastUrls);

        return lastUrls;
    }

    public Itarator createItarator()
    {
        return new ListItarator(this);
    }


    public class ListItarator implements Itarator{

        private BrowseHistory history;
        private int index;

        public ListItarator(BrowseHistory history)
        {

            this.history = history;
        }

        @Override
        public boolean hasNext() {
            return (index<history.urls.size());
        }

        @Override
        public String current() {
            return history.urls.get(index);
        }

        @Override
        public void next() {
            index++;
        }
    }
}
