package pegawai.arfiana_maulidiyah;
/*
author : arfiana maulidiyah
nim :  32602200012
berikan penjelasan kode ini baris perbaris dengan komentar
*/

import java.util.ArrayList;
import javax.swing.JOptionPane;

// Kelas ManajemenPegawaiGUI implementasi dari interface PengelolaPegawai
public class ManajemenPegawaiGUI implements PengelolaPegawai {

    // Atribut untuk menyimpan daftar pegawai menggunakan ArrayList
    private ArrayList<Pegawai> daftarPegawai = new ArrayList<>();

    // Implementasi metode tambahPegawai dari interface PengelolaPegawai
    @Override
    public void tambahPegawai(Pegawai pegawai) {
        // Menambah pegawai ke dalam daftarPegawai
        daftarPegawai.add(pegawai);
        // Menampilkan pesan sukses menggunakan JOptionPane
        JOptionPane.showMessageDialog(null, "Pegawai berhasil ditambahkan!");
    }

    // Implementasi metode tampilkanDaftarPegawai dari interface PengelolaPegawai
    @Override
    public void tampilkanDaftarPegawai() {
        // StringBuilder untuk menyusun output daftar pegawai
        StringBuilder output = new StringBuilder("Daftar Pegawai:\n");
        
        // Iterasi melalui daftarPegawai untuk menampilkan informasi pegawai
        for (Pegawai pegawai : daftarPegawai) {
            output.append("====================\n");
            output.append("Nama: ").append(pegawai.getNama()).append("\n");
            output.append("Jabatan: ").append(pegawai.getJabatan()).append("\n");

            // Menyesuaikan tampilan berdasarkan jenis pegawai (Manager atau Staff)
            if (pegawai instanceof Manager) {
                output.append("Bonus: $").append(((Manager) pegawai).getBonus()).append("\n");
            } else if (pegawai instanceof Staff) {
                output.append("Lembur: ").append(((Staff) pegawai).getLembur()).append(" jam\n");
            }

            output.append("====================\n");
        }

        // Menampilkan daftar pegawai menggunakan JOptionPane
        JOptionPane.showMessageDialog(null, output.toString());
    }

    // Metode utama (main method)
    public static void main(String[] args) {
        // Membuat objek ManajemenPegawaiGUI
        ManajemenPegawaiGUI aplikasi = new ManajemenPegawaiGUI();

        // Perulangan untuk interaksi dengan pengguna
        while (true) {
            // Opsi pilihan yang ditampilkan menggunakan JOptionPane
            String[] options = {"Tambah Pegawai", "Tampilkan Daftar Pegawai", "Keluar"};
            int choice = JOptionPane.showOptionDialog(null, "Pilih Operasi", "Manajemen Pegawai",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

            // Switch case untuk menanggapi pilihan pengguna
            switch (choice) {
                // Case 0: Tambah Pegawai
                case 0:
                    // Menampilkan dialog box untuk memilih jenis pegawai (Manager atau Staff)
                    String[] jenisPegawai = {"Manager", "Staff"};
                    String jenis = (String) JOptionPane.showInputDialog(null, "Pilih Jenis Pegawai", "Tambah Pegawai",
                            JOptionPane.QUESTION_MESSAGE, null, jenisPegawai, jenisPegawai[0]);

                    // Memasukkan nama pegawai melalui dialog box
                    String namaPegawai = JOptionPane.showInputDialog(null, "Masukkan Nama Pegawai:", "Tambah Pegawai", JOptionPane.QUESTION_MESSAGE);

                    // Memastikan bahwa jenis dan nama pegawai tidak null sebelum menambahkan pegawai
                    if (jenis != null && namaPegawai != null) {
                        // Membuat objek Manager atau Staff sesuai dengan pilihan pengguna
                        if (jenis.equals("Manager")) {
                            Manager manager = new Manager(namaPegawai);
                            aplikasi.tambahPegawai(manager);
                        } else if (jenis.equals("Staff")) {
                            Staff staff = new Staff(namaPegawai);
                            aplikasi.tambahPegawai(staff);
                        }
                    }
                    break;

                // Case 1: Tampilkan Daftar Pegawai
                case 1:
                    aplikasi.tampilkanDaftarPegawai();
                    break;

                // Case 2: Keluar dari Program
                case 2:
                    System.exit(0);
            }
        }
    }
}
