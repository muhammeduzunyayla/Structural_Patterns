public abstract class Tür {
    Isekil isekil;
    Irenkler irenkler;

    public  Tür(Irenkler renk,Isekil sekil){

        irenkler= renk;
        isekil= sekil;
    }


    public void olustur(){
        isekil.sekillendir();
        irenkler.renklendir();
    }
}
