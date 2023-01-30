package proxy;

public class RealEbook implements Ebook {

    private String filename;

    public RealEbook(String filename) {
        this.filename = filename;
    }

    private void load(){
        System.out.println("Loading the ebook "+ filename);
    }

    @Override
    public void  show(){
        System.out.println("Showing the ebook"+ filename);
    }

    @Override
    public String getFilename() {
        return filename;
    }
}
