public class Mahasiswa02 {
    String nama;
    String nim;
    String kelas;
    int nilai;

    public Mahasiswa02(String nama, String nim, String kelas) {
        this.nama = nama;
        this.nim = nim;
        this.kelas = kelas;
        this.nilai = -1;
    }

    public void tugasDinilai(int nilai) {
        this.nilai = nilai;
    }

    public String toString() {
        return "Nama: " + nama + ", NIM: " + nim + ", Kelas: " + kelas + ", Nilai: " + nilai;
    }
}