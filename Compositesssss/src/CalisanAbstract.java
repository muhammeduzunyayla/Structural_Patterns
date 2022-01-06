enum Rank{
    Yonetici,InsanKaynaklari,Gelistirici,Tasarimci
}

public abstract class CalisanAbstract {

    protected String _name;
    protected int _id;
    protected Rank _rank;

    public CalisanAbstract(String name,int id,Rank rank){
        this._id=id;
        this._name=name;
        this._rank=rank;
    }

    public void bilgiGoster(){}
    public void ekle(CalisanAbstract calisanAbstract){}
    public void cikar(CalisanAbstract calisanAbstract){}



}
