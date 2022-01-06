import java.math.BigDecimal;

public class Facade {
    private Banka banka;
    private Kredi kredi;
    private MerkezBanka merkezBanka;

    public Facade(){
        banka=new Banka();
        kredi=new Kredi();
        merkezBanka=new MerkezBanka();
    }

    public void KrediKullan(Musteri m, int talep){

        if(merkezBanka.KaraListeKontrol(m.getTcNo())&&kredi.KrediKullanmaDurumu(m)){
            banka.KrediyiKullan(m,talep);
            System.out.println("Kredi kullanırıldı");
        }
    }


}
