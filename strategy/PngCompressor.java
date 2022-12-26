package strategy;

public class PngCompressor implements Compressor{
    @Override
    public void compress(String fileNme) {
        System.out.println("Compressing using PNG");
    }
}
