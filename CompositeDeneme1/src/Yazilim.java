public class Yazilim extends Sirket{
    public Yazilim(String departman, String isim) {
        super(departman, isim);
    }


    public void Yazdir(){
        System.out.println(get_departman()+get_isim());
    }
}
