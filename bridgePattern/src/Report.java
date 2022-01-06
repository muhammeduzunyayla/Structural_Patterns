public abstract class Report  {
    IReportFormat reportFormat;

    public Report(IReportFormat Implemention){
        reportFormat=Implemention;
    }
    public Report(){

    }
    public void Display(){
        reportFormat.generate();
    }
}
