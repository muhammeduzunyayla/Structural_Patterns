public class FinansalDepartmant implements Departmant{
    private Integer id;
    private String name;

    public FinansalDepartmant(Integer id,String name){
        this.id=id;
        this.name=name;

    }
    @Override
    public void printDepartmantName() {
        System.out.println(getClass().getSimpleName());

    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



}