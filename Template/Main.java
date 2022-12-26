package Template;

public class Main {
    public static void main (String[] args)
    {
        // Transfer money
        var task1=new TransferMoneyTask();
        task1.execute();

        // generate report
        var task2=new GenerateReportTask();
        task2.execute();

    }
}
