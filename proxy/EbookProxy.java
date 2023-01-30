package proxy;

public class EbookProxy implements Ebook{
    private String filename;
    private  RealEbook ebook;
    public EbookProxy(String filename) {
        this.filename = filename;
    }

    @Override
    public void show() {
        if (ebook==null)
              ebook = new RealEbook(filename);

        ebook.show();
    }

    @Override
    public String getFilename() {
        return null;
    }
}
