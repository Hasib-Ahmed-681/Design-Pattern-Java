package visitor;

public class main {
    public static void main(String[] args)
    {
        var document= new HtmlDocument();
        document.add(new HeadingNode());
        document.add(new AnchorNode());

        document.execute(new HighlightOperation());

        document.execute(new PlainTextOperation());
    }
}
