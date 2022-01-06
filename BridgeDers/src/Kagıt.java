public class Kagıt extends Tür{


    public Kagıt(Irenkler renk, Isekil sekil) {
        super(renk, sekil);
    }

    @Override
    public void olustur() {
        System.out.println("Kagıt olusturuldu");
        super.olustur();
    }
}
