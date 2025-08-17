package Projek_SDL_UTS;

public class Sertifikat {
    private String prestasi;
    private String tingkat;
    private int juara;

    Sertifikat(String prestasi) {
        this.prestasi = prestasi;
    }

    public void setPrestasi(String prestasi) {
        this.prestasi = prestasi;
    }

    public void setTingkat(String tingkat) {
        this.tingkat = tingkat;
    }

    public void setJuara(int juara) {
        this.juara = juara;
    }

    public String getPrestasi() {
        return prestasi;
    }

    public String getTingkat() {
        return tingkat;
    }

    public int getJuara() {
        return juara;
    }

}
