package pegawai.arfiana_maulidiyah;
/*
author : arfiana maulidiyah
nim :  32602200012
berikan penjelasan kode ini baris perbaris dengan komentar, bagian polimorfisme, getter setter, constructor, inheritance
*/

// Kelas Manager merupakan inheritance dari kelas Pegawai
public class Manager extends Pegawai {
    // Atribut khusus Manager
    private int bonus;

    // Konstruktor Manager dengan parameter nama
    public Manager(String nama) {
        // Memanggil konstruktor kelas induk (Pegawai) dengan kata kunci super
        super(nama, "Manager");
        // Menginisialisasi atribut bonus khusus untuk Manager
        this.bonus = 5000;
    }

    // Getter dan Setter khusus untuk atribut bonus
    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    // Override metode info untuk polimorfisme
    @Override
    public void info() {
        // Memanggil metode info dari kelas induk (Pegawai)
        super.info();
        // Menampilkan informasi tambahan (bonus) khusus untuk Manager
        System.out.println("Bonus: $" + bonus);
    }
}
