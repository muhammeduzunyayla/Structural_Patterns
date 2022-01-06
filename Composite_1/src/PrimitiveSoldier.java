public class PrimitiveSoldier extends Soldier{

    public PrimitiveSoldier(String name, Rank rank) {
        super(name, rank);
    }

    //bu fonksiyonun leaf için bir anlamı yoktur
    @Override
    public void addSoldier(Soldier soldier) {


    }
    //bu fonksyionun da leaf için bir anlamı yoktur
    @Override
    public void removeSoldier(Soldier soldier) {

    }

    @Override
    public void executeOrder() {
        System.out.println(_rank + _name);

    }
}
