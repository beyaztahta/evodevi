package lambdaday01;

public class Can {

    private String kurSezonu;
    private String kursAdı;
    private int ortalama;
    private int ogrenciSayısı;

    public Can() {
    }

    public Can(String kurSezonu, String kursAdı, int ortalama, int ogrenciSayısı) {
        this.kurSezonu = kurSezonu;
        this.kursAdı = kursAdı;
        this.ortalama = ortalama;
        this.ogrenciSayısı = ogrenciSayısı;
    }

    public String getKurSezonu() {
        return kurSezonu;
    }

    public void setKurSezonu(String kurSezonu) {
        this.kurSezonu = kurSezonu;
    }

    public String getKursAdı() {
        return kursAdı;
    }

    public void setKursAdı(String kursAdı) {
        this.kursAdı = kursAdı;
    }

    public int getOrtalama() {
        return ortalama;
    }

    public void setOrtalama(int ortalama) {
        this.ortalama = ortalama;
    }

    public int getOgrenciSayısı() {
        return ogrenciSayısı;
    }

    public void setOgrenciSayısı(int ogrenciSayısı) {
        this.ogrenciSayısı = ogrenciSayısı;
    }

    @Override
    public String toString() {
        return "Can{" +
                "kurSezonu='" + kurSezonu + '\'' +
                ", kursAdı='" + kursAdı + '\'' +
                ", ortalama=" + ortalama +
                ", ogrenciSayısı=" + ogrenciSayısı +
                '}';
    }
}
