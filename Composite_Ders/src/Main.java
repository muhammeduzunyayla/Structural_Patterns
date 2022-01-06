public class Main {

    public static void main(String[] args) {

        InsanKaynaklari insanKaynaklari= new InsanKaynaklari(1,"Halit",Rank.InsanKaynaklari);
        InsanKaynaklari yönetici=new Yonetici(2,"Muhammed,",Rank.Yonetici);
        insanKaynaklari.calisanEkle(yönetici);
        yönetici.bilgiGoster();





    }
}
