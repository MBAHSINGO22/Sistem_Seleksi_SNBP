package Projek_SDL_UTS;

import java.util.ArrayList;

// Kelas Peserta yang merepresentasikan peserta dalam suatu program atau kompetisi
public class Peserta {
    // Atribut untuk menyimpan nama peserta
    private String nama;
    // Atribut untuk menyimpan nomor pendaftaran peserta
    private String noPendaftaran;
    // Atribut boolean untuk menyimpan apakah peserta memiliki prestasi akademik
    private boolean prestasiAkademik;
    
    // Atribut untuk menyimpan nilai Bahasa Indonesia peserta
    private double nilaiBahasaIndonesia;
    // Atribut untuk menyimpan nilai Matematika peserta
    private double nilaiMatematika;
    // Atribut untuk menyimpan nilai IPA peserta
    private double nilaiIpa;
    // Atribut untuk menyimpan nilai Bahasa Inggris peserta
    private double nilaiBahasaInggris;

    // Atribut untuk menyimpan daftar sertifikat yang dimiliki peserta
    private ArrayList<Sertifikat> sertifikat = new ArrayList<>();

    // Konstruktor default untuk kelas Peserta
    public Peserta() {}

    // Metode untuk menambahkan sertifikat ke dalam daftar sertifikat peserta
    public void addSertifikat(Sertifikat sertif) {
        sertifikat.add(sertif);
    }

    // Metode untuk mendapatkan daftar sertifikat peserta
    public ArrayList<Sertifikat> getSertifikat() {
        return sertifikat;
    }

    // Metode untuk menghitung rata-rata nilai dari semua mata pelajaran
    public double hitungRata() {
        return (nilaiBahasaIndonesia + nilaiMatematika + nilaiIpa + nilaiBahasaInggris) / 4;
    }
    
    // Metode untuk mengatur nama peserta
    public void setNama(String nama) {
        this.nama = nama;
    }

    // Metode untuk mengatur status prestasi akademik peserta
    public void setPrestasiAkademik(boolean x) {
        this.prestasiAkademik = x;
    }

    // Metode untuk mendapatkan status prestasi akademik peserta
    public boolean getPrestasiAkademik() {
        return prestasiAkademik;
    }

    // Metode untuk mengatur nomor pendaftaran peserta
    public void setNoPendaftaran(String noPendaftaran) {
        this.noPendaftaran = noPendaftaran;
    }

    // Metode untuk mengatur nilai Bahasa Indonesia peserta
    public void setNilaiBahasaIndonesia(double nilaiBahasaIndonesia) {
        this.nilaiBahasaIndonesia = nilaiBahasaIndonesia;
    }

    // Metode untuk mengatur nilai Matematika peserta
    public void setNilaiMatematika(double nilaiMatematika) {
        this.nilaiMatematika = nilaiMatematika;
    }

    // Metode untuk mengatur nilai IPA peserta
    public void setNilaiIpa(double nilaiIpa) {
        this.nilaiIpa = nilaiIpa;
    }

    // Metode untuk mengatur nilai Bahasa Inggris peserta
    public void setNilaiBahasaInggris(double nilaiBahasaInggris) {
        this.nilaiBahasaInggris = nilaiBahasaInggris;
    }

    // Metode untuk mendapatkan nama peserta
    public String getNama() {
        return nama;
    }

    // Metode untuk mendapatkan nomor pendaftaran peserta
    public String getNoPendaftaran() {
        return noPendaftaran;
    }

    // Metode untuk mendapatkan nilai Bahasa Indonesia peserta
    public double getNilaiBahasaIndonesia() {
        return nilaiBahasaIndonesia;
    }

    // Metode untuk mendapatkan nilai Matematika peserta
    public double getNilaiMatematika() {
        return nilaiMatematika;
    }

    // Metode untuk mendapatkan nilai IPA peserta
    public double getNilaiIpa() {
        return nilaiIpa;
    }

    // Metode untuk mendapatkan nilai Bahasa Inggris peserta
    public double getNilaiBahasaInggris() {
        return nilaiBahasaInggris;
    }
}