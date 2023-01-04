package facade;

public class main {
    public  static void main(String[] args){
            var service = new NotificationService();
            service.send("hello world", "target");
    }
}
