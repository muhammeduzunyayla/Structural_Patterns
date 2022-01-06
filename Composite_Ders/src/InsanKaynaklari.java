import java.util.ArrayList;
import java.util.List;
enum Rank{
    Yonetici,
    InsanKaynaklari,
    Tasarimci,
    Gelistirici
}

public class InsanKaynaklari implements ICalisan{

    private int _id;
    private  String _isim;
    protected Rank _rank;
    private List<ICalisan> _calisan;

    public InsanKaynaklari(int id, String isim, Rank rank) {
        this._rank=rank;
        this._id=id;
        this._isim=isim;
        _calisan=new ArrayList<>();
    }


    @Override
    public void bilgiGoster() {
        System.out.println(_id+_isim+_rank);
        for (ICalisan calisan1:_calisan) {
            calisan1.bilgiGoster();

        }

    }
    public void calisanEkle(ICalisan calisan){
         _calisan.add(calisan);
    };
    public void calisanCikar(ICalisan calisan){
        _calisan.remove(calisan);


    };

    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public String get_isim() {
        return _isim;
    }

    public void set_isim(String _isim) {
        this._isim = _isim;
    }
}
