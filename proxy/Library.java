package proxy;

import java.util.HashMap;
import java.util.Map;

public class Library {

    private Map<String,Ebook> ebooks= new HashMap<>(); //filename = key , Ebook = value

    public void add(Ebook ebook){
               ebooks.put(ebook.getFilename(),ebook);
    }

    public void openEbook(String filename){
        ebooks.get(filename).show();
    }
}
