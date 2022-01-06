public class EmployeePerformanceTest extends Report{
    public EmployeePerformanceTest(IReportFormat Implemention) {
        super(Implemention);
    }
    public void Display(){
        System.out.println("----Çalışan Performans Raporu----");
        super.Display();
    }
}
