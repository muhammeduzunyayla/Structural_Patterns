import java.util.ArrayList;
import java.util.List;

public class Kadro extends Sirket{

    private List<Sirket> sirkettekiler;
    public Kadro(String departman, String isim) {
        super(departman, isim);
        sirkettekiler=new ArrayList<>();

    }
    public void Ekle(Sirket s){
        sirkettekiler.add(s);

    }
    public void Sil(Sirket s){
        sirkettekiler.remove(s);
    }
    public void Yazdir(){
        System.out.println(get_departman()+get_isim());
        for (Sirket u:sirkettekiler
             ) {
            u.Yazdir();

        }
    }


}
