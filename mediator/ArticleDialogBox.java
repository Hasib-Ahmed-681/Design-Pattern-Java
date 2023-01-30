package mediator;

public class ArticleDialogBox extends DilaogBox{
    private  ListBox articalesListBox= new ListBox(this);
    private  TextBox titleTextBox = new TextBox(this);
    private  Button saveButton = new Button(this);

    public void simulateuserInteraction(){
        articalesListBox.setSelection("Article 1");
        titleTextBox.setContent("");
        System.out.println("TextBox: "+ titleTextBox.getContent());
        System.out.println("Button "+ saveButton.isEnable());
    }
    @Override
    public void changed(UIControl control) {
        if(control== articalesListBox)
        {
            articleSelected();
        }else if(control== titleTextBox)
            titleChanged();
    }

    private void titleChanged()
    {
        var content = titleTextBox.getContent();
        var isEmpty= (content == null || content.isEmpty());
        saveButton.setEnable(!isEmpty);
    }

    private void articleSelected()
    {
        titleTextBox.setContent(articalesListBox.getSelection());
        saveButton.setEnable(true);
    }
}
