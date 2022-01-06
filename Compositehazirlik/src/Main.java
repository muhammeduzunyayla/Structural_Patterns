public class Main {

    public static void main(String[] args) {

        CompositeSoldier generalMuhammed= new CompositeSoldier("Muhammed",Rank.General);
        CompositeSoldier generalAbdullah= new CompositeSoldier("Abdullah",Rank.General);
        generalAbdullah.ekle(new PrimitiveSoldier("Kübra",Rank.LieutenantColonel));
        generalAbdullah.ekle(new PrimitiveSoldier("Ayfer",Rank.Captain));
        generalMuhammed.ekle(new PrimitiveSoldier("TAMAYO",Rank.Colonel));
        generalMuhammed.ekle(new PrimitiveSoldier("Rio",Rank.Lieutenant));


        generalMuhammed.ekle(generalAbdullah);
        generalMuhammed.goster();



    }
}
