public class Tasarimci extends CalisanAbstract{
    public Tasarimci(String name, int id, Rank rank) {
        super(name, id, rank);
    }

    @Override
    public void bilgiGoster() {
        System.out.println(_id+_name+_rank);

    }
}
