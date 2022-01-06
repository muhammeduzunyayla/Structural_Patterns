public class Main {

    public static void main(String[] args) {

        Report report=new EmployeePerformanceTest(new DesktopFormat());
        report.Display();
        Report report1=new SalesReport(new WebFormat());
        report1.Display();
    }
}
//kutu kağıt beyaz kırmızı kare daire