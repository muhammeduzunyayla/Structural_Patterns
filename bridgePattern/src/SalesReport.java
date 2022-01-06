public class SalesReport extends Report{
    public SalesReport(IReportFormat Implemention) {
        super(Implemention);
    }
    public void Display(){
        System.out.println("----Satış Raporu----");
        super.Display();
    }
}
