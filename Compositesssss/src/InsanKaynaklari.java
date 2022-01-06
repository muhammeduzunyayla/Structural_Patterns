import java.util.ArrayList;
import java.util.List;

public class InsanKaynaklari extends CalisanAbstract{
    private List<CalisanAbstract> calisanlar;
    public InsanKaynaklari(String name, int id, Rank rank) {
        super(name, id, rank);
        calisanlar=new ArrayList<>();
    }

    @Override
    public void bilgiGoster() {
        System.out.println(_id+_name+_rank);

    }
    public void ekle(CalisanAbstract calisanAbstract){
        calisanlar.add(calisanAbstract);
    }
    public void cikar(CalisanAbstract calisanAbstract){
        calisanlar.remove(calisanAbstract);
    }
}
