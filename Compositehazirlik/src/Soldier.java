enum Rank
{
    General,
    Colonel,
    LieutenantColonel,
    Major,
    Captain,
    Lieutenant
}
public abstract class Soldier {
    protected Rank _rank;
    protected String _name;

    public Soldier(String name,Rank rank){
        this._name=name;
        this._rank=rank;

    }

    public Rank get_rank() {
        return _rank;
    }

    public void set_rank(Rank _rank) {
        this._rank = _rank;
    }

    public String get_name() {
        return _name;
    }

    public void set_name(String _name) {
        this._name = _name;
    }
    public abstract void ekle(Soldier soldier);
    public abstract void sil(Soldier soldier);
    public abstract void goster();

}
