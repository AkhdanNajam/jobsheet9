public class Surat02 {
    String idSurat;
    String namaMahasiswa;
    String kelas;
    char jenisIzin;
    int durasi;

    public Surat02() {
        this.idSurat = "";
        this.namaMahasiswa = "";
        this.kelas = "";
        this.jenisIzin = ' ';
        this.durasi = 0;
    }

    public Surat02(String idSurat, String namaMahasiswa, String kelas, char jenisIzin, int durasi) {
        this.idSurat = idSurat;
        this.namaMahasiswa = namaMahasiswa;
        this.kelas = kelas;
        this.jenisIzin = jenisIzin;
        this.durasi = durasi;
    }

    @Override
    public String toString() {
        String jenis = jenisIzin == 'S' || jenisIzin == 's' ? "Sakit" : "Izin";
        return String.format("ID: %s, Nama: %s, Kelas: %s, Jenis: %s, Durasi: %d hari",
                idSurat, namaMahasiswa, kelas, jenis, durasi);
    }
}