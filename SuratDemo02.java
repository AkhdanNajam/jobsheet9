import java.util.Scanner;

public class SuratDemo02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StackSurat02 stack = new StackSurat02(10);
        int pilih;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat");
            System.out.print("Pilih: ");
            pilih = scan.nextInt();
            scan.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("ID Surat: ");
                    String idSurat = scan.nextLine();
                    System.out.print("Nama Mahasiswa: ");
                    String nama = scan.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = scan.nextLine();
                    System.out.print("Jenis Izin (S/I): ");
                    char jenisIzin = scan.nextLine().toUpperCase().charAt(0);
                    System.out.print("Durasi izin (hari): ");
                    int durasi = scan.nextInt();
                    scan.nextLine();
                    Surat02 surat = new Surat02(idSurat, nama, kelas, jenisIzin, durasi);
                    stack.push(surat);
                    System.out.println("Surat izin berhasil diterima.");
                    break;
                case 2:
                    Surat02 proses = stack.pop();
                    if (proses != null) {
                        System.out.println("Surat yang diproses: " + proses);
                    } else {
                        System.out.println("Tidak ada surat izin untuk diproses.");
                    }
                    break;
                case 3:
                    Surat02 terakhir = stack.peek();
                    if (terakhir != null) {
                        System.out.println("Surat izin terakhir: " + terakhir);
                    } else {
                        System.out.println("Tidak ada surat izin dalam stack.");
                    }
                    break;
                case 4:
                    System.out.print("Masukkan nama mahasiswa untuk dicari: ");
                    String cariNama = scan.nextLine();
                    boolean ada = stack.containsByNama(cariNama);
                    if (ada) {
                        System.out.println("Surat izin untuk " + cariNama + " ditemukan.");
                    } else {
                        System.out.println("Surat izin untuk " + cariNama + " tidak ditemukan.");
                    }
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilih >= 1 && pilih <= 4);

        scan.close();
    }
}