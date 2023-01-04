package command;

import command.fx.Button;

public class main {
    public static void main(String[] args)
    {
        //Button
        var service=new CustomerService();
        var command= new AddCustomerCommand(service);
        var button=new Button(command);
        button.click();

        var composite = new CompositeCommand();

        composite.add(new ResizeCommand());
        composite.add(new BlackAndWhiteCommand() );
        composite.execute();

    }
}
