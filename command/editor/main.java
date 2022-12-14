package command.editor;

public class main {
    public static void main (String[] args)
    {
        var history = new History();
        var document= new HtmlDocument();

        document.setContent("hello World");

        var boldCommand =new BoldCommand(document, history);
        boldCommand.execute();
        System.out.println(document.getContent());

        boldCommand.unexecute();
        System.out.println(document.getContent());

        var undoCommand = new UndoCommand(history);
        undoCommand.execute();
        System.out.println(document.getContent());

    }
}
