public class Main {

    public static void main(String[] args) {

        Yonetici yonetici1muhammed=new Yonetici("Muhammed",6,Rank.Yonetici);
        Yonetici yonetici2Apo=new Yonetici("Abdullah",25,Rank.Yonetici);
        yonetici2Apo.ekle(new Tasarimci("Ayse",8,Rank.Tasarimci));
        yonetici2Apo.ekle(new Gelistirici("Nuran",9,Rank.Gelistirici));
        yonetici1muhammed.ekle(new Tasarimci("Mehmet",7,Rank.Tasarimci));
        yonetici1muhammed.ekle(new Gelistirici("Batuflex",12,Rank.Gelistirici));

        yonetici1muhammed.ekle(yonetici2Apo);


        yonetici1muhammed.bilgiGoster();




    }
}
