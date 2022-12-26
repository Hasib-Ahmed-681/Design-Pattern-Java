package strategy;

public class JpegCompressor implements Compressor{
    @Override
    public void compress(String fileNme) {
        System.out.println("Compressing using JPEG");
    }
}
