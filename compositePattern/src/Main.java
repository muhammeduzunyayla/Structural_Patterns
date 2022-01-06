public class Main {

    public static void main(String[] args) {

        Departmant satışdepartmant=new SatışDepartmant(2,"Satış");
        Departmant finansaldepartmant=new FinansalDepartmant(4,"Finansal");

        BaşDepartmant başDepartmant=new BaşDepartmant(6,"Baş Departmant");

        başDepartmant.addDepartmantName(satışdepartmant);
        başDepartmant.addDepartmantName(finansaldepartmant);

        başDepartmant.printDepartmantName();

    }
}
