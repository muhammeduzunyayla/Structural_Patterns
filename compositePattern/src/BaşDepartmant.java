import java.util.ArrayList;
import java.util.List;

public class BaşDepartmant implements Departmant{
   private Integer id;
   private String name;

   private List<Departmant> childDepartmants;
   public BaşDepartmant(Integer id,String name){
       this.id=id;
       this.name=name;
       this.childDepartmants= new ArrayList<>();

   }

    @Override
    public void printDepartmantName() {
       childDepartmants.forEach(Departmant::printDepartmantName);

    }
    public void addDepartmantName(Departmant departmant){
       childDepartmants.add(departmant);
    }
    public void removeDepartmant(Departmant departmant){
       childDepartmants.remove(departmant);
    }
}
