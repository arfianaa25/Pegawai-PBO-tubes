package pegawai.arfiana_maulidiyah;
/*
author : arfiana maulidiyah
nim :  32602200012
berikan penjelasan kode ini baris perbaris dengan komentar
*/

public class Pegawai {
    // Deklarasi atribut private
    private String nama;
    private String jabatan;

    // Konstruktor Pegawai
    public Pegawai(String nama, String jabatan) {
        this.nama = nama;
        this.jabatan = jabatan;
    }

    // Getter dan Setter untuk atribut nama
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    // Getter dan Setter untuk atribut jabatan
    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    // Metode polymorphism info()
    public void info() {
        System.out.println("Nama: " + nama);
        System.out.println("Jabatan: " + jabatan);
    }
}
