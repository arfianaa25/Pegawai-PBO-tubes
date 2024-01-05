
package pegawai.arfiana_maulidiyah;


/*


author : arfiana maulidiyah
nim :  32602200012

berikan penjelasan kode ini baris perbaris dengan komentar
*/



import javax.swing.JOptionPane;
public class Main {
    
    public static void main(String[] args) {
        // Membuat objek ManajemenPegawaiGUI
        ManajemenPegawaiGUI aplikasi = new ManajemenPegawaiGUI();

        // Perulangan utama untuk interaksi dengan pengguna
        while (true) {
            // Menampilkan opsi dalam bentuk dialog box
            String[] options = {"Tambah Pegawai", "Tampilkan Daftar Pegawai", "Keluar"};
            int choice = JOptionPane.showOptionDialog(null, "Pilih Operasi", "Manajemen Pegawai",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

            // Menggunakan switch case untuk menanggapi pilihan pengguna
            switch (choice) {
                // Case 0: Menambah Pegawai
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

                // Case 1: Menampilkan Daftar Pegawai
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