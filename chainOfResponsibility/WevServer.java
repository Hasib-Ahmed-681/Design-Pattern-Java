package chainOfResponsibility;

public class WevServer {
    private Handler handler;

    public WevServer(Handler handler) {
        this.handler = handler;
    }

    public void handle(HttpRequest request){
        //Authentication
        handler.handle(request);

        //login
        //Compression
    }
}
