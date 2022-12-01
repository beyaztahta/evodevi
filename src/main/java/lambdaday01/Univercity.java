package lambdaday01;

public class Univercity {

    private String univercity;
    private String bolum;
    private int ogrenciSayısı;
    private int notOrtalama;

    public Univercity(){

    }

    public Univercity(String univercity, String bolum, int ogrenciSayısı, int notOrtalama) {
        this.univercity = univercity;
        this.bolum = bolum;
        this.ogrenciSayısı = ogrenciSayısı;
        this.notOrtalama = notOrtalama;
    }

    public String getUnivercity() {
        return univercity;
    }

    public void setUnivercity(String univercity) {
        this.univercity = univercity;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public int getOgrenciSayısı() {
        return ogrenciSayısı;
    }

    public void setOgrenciSayısı(int ogrenciSayısı) {
        this.ogrenciSayısı = ogrenciSayısı;
    }

    public int getNotOrtalama() {
        return notOrtalama;
    }

    public void setNotOrtalama(int notOrtalama) {
        this.notOrtalama = notOrtalama;
    }

    @Override
    public String toString() {
        return "Univercity{" +
                "univercity='" + univercity + '\'' +
                ", bolum='" + bolum + '\'' +
                ", ogrenciSayısı='" + ogrenciSayısı + '\'' +
                ", notOrtalama='" + notOrtalama + '\'' +
                '}';
    }
}
