package command;

import command.fx.Command;

public class AddCustomerCommand implements Command {
    public AddCustomerCommand(CustomerService service) {
        this.service = service;
    }

    private CustomerService service;
    @Override
    public void execute() {
        service.addCustomer();
    }
}
