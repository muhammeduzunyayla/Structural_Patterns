public class Musteri {
    private int musteriNo;
    private String tcNo;
    private String ad;

    public Musteri(int musteriNo,String tcNo,String ad){
        this.ad=ad;
        this.musteriNo=musteriNo;
        this.tcNo=tcNo;
    }

    public int getMusteriNo() {
        return musteriNo;
    }

    public void setMusteriNo(int musteriNo) {
        this.musteriNo = musteriNo;
    }

    public String getTcNo() {
        return tcNo;
    }

    public void setTcNo(String tcNo) {
        this.tcNo = tcNo;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }
}
