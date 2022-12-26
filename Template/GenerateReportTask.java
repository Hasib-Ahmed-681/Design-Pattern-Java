package Template;

public class GenerateReportTask extends Task {
    private AuditTrail auditTrail;

    @Override
    protected void doExecute() {
        System.out.println("Genarate Report");
    }
}
