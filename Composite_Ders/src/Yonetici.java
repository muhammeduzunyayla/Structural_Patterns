public class Yonetici extends InsanKaynaklari{
    private int id;
    private String isim;

    public Yonetici(int id, String isim, Rank rank) {
        super(id, isim, rank);
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    @Override
    public void bilgiGoster() {
        System.out.println(id+isim);
    }
}
