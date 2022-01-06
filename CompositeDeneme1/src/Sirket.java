enum Bolum{
    ArGe,Analist,Test,Senior,Junior
}


public abstract class Sirket {
    private String _departman;
    private String _isim;

    public Sirket(String departman,String isim){
        this._departman=departman;
        this._isim=isim;
    }

    public String get_departman() {
        return _departman;
    }

    public void set_departman(String _departman) {
        this._departman = _departman;
    }

    public String get_isim() {
        return _isim;
    }

    public void set_isim(String _isim) {
        this._isim = _isim;
    }
    public void Yazdir(){
        System.out.println(_isim+_departman);
    }

}
