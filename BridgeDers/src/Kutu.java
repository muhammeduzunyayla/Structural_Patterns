public class Kutu extends Tür{


    public Kutu(Irenkler renk, Isekil sekil) {
        super(renk, sekil);
    }

    @Override
    public void olustur() {
        System.out.println("Kutu oluşturuldu..");
        super.olustur();
    }
}
