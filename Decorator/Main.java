package Decorator;

public class Main {
    public static void main(String[] args){
        storeCreditCard(new EncrytedCloudStream(new CloudStream()));
        storeCreditCard(new CompressedCloudStream(new CloudStream()));
        storeCreditCard(new EncrytedCloudStream(new CompressedCloudStream(new CloudStream())));

    }

    public static void storeCreditCard(Stream stream){
        stream.write("4345-3565-4634-3435");
    }
}
