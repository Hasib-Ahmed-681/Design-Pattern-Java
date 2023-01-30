package memento;

public class EditorState {
    private final String content; //final can not change

    public EditorState(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}
