public class Main {

    public static void main(String[] args) {


        //root oluşturulur
        CompositeSoldier generealMuhammed=new CompositeSoldier("Muhammed",Rank.General);

        //root altında leaf adı altında iki tane nesne örneği ekleyelim
        generealMuhammed.addSoldier(new PrimitiveSoldier("Tamayo",Rank.Colonel));
        generealMuhammed.addSoldier(new PrimitiveSoldier("Tokio",Rank.Colonel));

        //Composite tipler oluşturulur

        CompositeSoldier colonelBulak=new CompositeSoldier("Bulak",Rank.Colonel);
        CompositeSoldier lieutantColonelBurhan =new CompositeSoldier("Burhan",Rank.LieutenantColonel);

        //Composite tipe bağlı primitive tipler oluşturulur
        lieutantColonelBurhan.addSoldier(new PrimitiveSoldier("Rio",Rank.Captain));
        colonelBulak.addSoldier(lieutantColonelBurhan);
        colonelBulak.addSoldier(new PrimitiveSoldier("selin",Rank.Captain));

        //rootun altına composite nesne örneği eklenir
        generealMuhammed.addSoldier(colonelBulak);

        //
        generealMuhammed.addSoldier(new PrimitiveSoldier("Zulu",Rank.LieutenantColonel));

        // root için ExecuteOrder operasyonu uygulanır. Buna göre root altındaki tüm nesneler için bu operasyon uygulanır
        generealMuhammed.executeOrder();





    }
}
