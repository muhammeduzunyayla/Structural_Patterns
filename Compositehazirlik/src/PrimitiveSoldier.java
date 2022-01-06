public class PrimitiveSoldier extends Soldier{

    public PrimitiveSoldier(String name, Rank rank) {
        super(name, rank);
    }

    @Override
    public void ekle(Soldier soldier) {

    }

    @Override
    public void sil(Soldier soldier) {

    }

    @Override
    public void goster() {
        System.out.println(_name+_rank);

    }
}
