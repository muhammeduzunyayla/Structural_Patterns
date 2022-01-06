import java.util.ArrayList;
import java.util.List;

public class CompositeSoldier extends Soldier{

    // Composite tip kendi içerisinde birden fazla Component tipi içerebilir. Bu tipleri bir koleksiyon içerisinde tutabilir.
    private List<Soldier> _soldiers;



    public CompositeSoldier(String name, Rank rank) {
        super(name, rank);
        _soldiers = new ArrayList<>();
    }

    @Override
    public void addSoldier(Soldier soldier) {
        _soldiers.add(soldier);

    }

    @Override
    public void removeSoldier(Soldier soldier) {
        _soldiers.remove(soldier);

    }

    @Override
    public void executeOrder() {
        System.out.println(_rank + _name);
        for (Soldier soldier:_soldiers) {
            soldier.executeOrder();

        }
    }
}
