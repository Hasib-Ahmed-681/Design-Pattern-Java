package singleton;

public class Main {
    public static void main(String[] args){
        ConfigManager manager=ConfigManager.getInstance();
        manager.set("Name","TTT");

        ConfigManager other=ConfigManager.getInstance();
        System.out.println(other.get("Name"));
    }
}
