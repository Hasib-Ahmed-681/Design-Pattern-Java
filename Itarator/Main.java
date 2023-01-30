package Itarator;

public class Main {
    public static void main(String[] args)
    {
        BrowseHistory history = new BrowseHistory();

        history.push("a");
        history.push("b");
        history.push("c");

        Itarator itarator=history.createItarator();

        while(itarator.hasNext())
        {
            String url=itarator.current();
            System.out.println(url);
            itarator.next();
        }

    }
}
