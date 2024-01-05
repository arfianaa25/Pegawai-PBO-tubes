package pegawai.arfiana_maulidiyah;
/*
author : arfiana maulidiyah
nim :  32602200012
berikan penjelasan kode ini baris perbaris dengan komentar, bagian polimorfisme, getter setter, constructor, inheritance
*/

// Kelas Staff merupakan turunan dari kelas Pegawai
public class Staff extends Pegawai {
    // Atribut khusus Staff
    private int lembur;

    // Konstruktor Staff dengan parameter nama
    public Staff(String nama) {
        // Memanggil konstruktor kelas induk (Pegawai) dengan kata kunci super
        super(nama, "Staff");
        // Menginisialisasi atribut lembur khusus untuk Staff
        this.lembur = 10;
    }

    // Getter dan Setter khusus untuk atribut lembur
    public int getLembur() {
        return lembur;
    }

    public void setLembur(int lembur) {
        this.lembur = lembur;
    }

    // Override metode info untuk polimorfisme
    @Override
    public void info() {
        // Memanggil metode info dari kelas induk (Pegawai)
        super.info();
        // Menampilkan informasi tambahan (lembur) khusus untuk Staff
        System.out.println("Lembur: " + lembur + " jam");
    }
}
