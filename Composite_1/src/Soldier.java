enum Rank{
    General,
    Colonel,
    LieutenantColonel,
    Major,
    Captain,
    Lieutenant


}


public abstract class Soldier {
    protected String _name;
    protected Rank _rank;

    public Soldier(String name,Rank rank){
      this._name=name;
      this._rank=rank;

  }

   public abstract void addSoldier(Soldier soldier);
    public abstract void removeSoldier(Soldier soldier);
    public abstract void executeOrder();  //Hem Leaf hem de Composite sınıfı için uygulanacak metot



}
