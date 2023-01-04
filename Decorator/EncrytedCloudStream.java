package Decorator;

public class EncrytedCloudStream implements Stream{
    private Stream stream;

    public EncrytedCloudStream(Stream stream) {
        this.stream=stream;
    }

    @Override
    public void write(String data) {
        var encrypted=encrypt(data);
        stream.write(encrypted);
    }

    private String encrypt(String data){
        return "!@#$(%)%)#$(%)#%%#$";
    }
}
