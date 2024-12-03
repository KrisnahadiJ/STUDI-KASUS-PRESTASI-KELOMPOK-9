import java.util.Scanner;

public class Prestasi9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] dataPrestasi = new String[100][5];
        int jumlahData = 0;
        int pilihan;

        do {
            System.out.println("\n=================================================");
            System.out.println("\n========= PENCATATAN PRESTASI MAHASISWA =========");
            System.out.println("\n=================================================");
            System.out.println("1. Tambah Data Prestasi");
            System.out.println("2. Tampilkan Semua Prestasi");
            System.out.println("3. Analisis Prestasi Berdasarkan Jenis");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    if (jumlahData >= dataPrestasi.length) {
                        System.out.println("Kapasitas data penuh. Tidak dapat menambahkan data lagi.");
                    } else {
                        tambahDataPrestasi(dataPrestasi, jumlahData);
                        jumlahData++;
                    }
                    break;

                case 2:
                    tampilkanSemuaPrestasi(dataPrestasi, jumlahData);
                    break;

                case 3:
                    System.out.print("Masukkan Jenis Prestasi yang ingin dianalisis: ");
                    String jenisAnalisis = scanner.nextLine();
                    analisisPrestasi(dataPrestasi, jumlahData, jenisAnalisis);
                    break;

                case 4:
                    System.out.println("Program selesai.");
                    System.out.println("Terima kasih atas data yang anda berikan.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        } while (pilihan != 4);
    }