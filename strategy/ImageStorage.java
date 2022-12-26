package strategy;

public class ImageStorage {

    public void store(String filename , Compressor compressor, Filter filter)
    {
        //JPEG,PNG...
        compressor.compress(filename);


        //B&W,High Contrast
        filter.apply(filename);
    }
}
