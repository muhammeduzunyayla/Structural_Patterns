import java.util.ArrayList;
import java.util.List;

public class CompositeSoldier extends Soldier{

    List<Soldier> askerler;

    public CompositeSoldier(String name, Rank rank) {
        super(name, rank);
        askerler=new ArrayList<>();
    }

    @Override
    public void ekle(Soldier soldier) {
       askerler.add(soldier);
    }

    @Override
    public void sil(Soldier soldier) {
        askerler.remove(soldier);
    }

    @Override
    public void goster() {
        System.out.println(_name+_rank);
        for (Soldier soldier:askerler) {

            soldier.goster();

        }
    }
}
