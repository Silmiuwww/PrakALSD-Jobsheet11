package TugasLinkedList;

import java.util.Scanner;
public class MainQueue12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QueueLinkedList12 antrian = new QueueLinkedList12();
        int pilih;

        do {
            System.out.println("\n==== MENU ANTRIAN LAYANAN KEMAHASISWAAN ====");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Panggil Antrian");
            System.out.println("3. Lihat Semua Antrian");
            System.out.println("4. Antrian Terdepan");
            System.out.println("5. Antrian Terakhir");
            System.out.println("6. Jumlah Antrian");
            System.out.println("7. Kosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilih = sc.nextInt(); sc.nextLine(); 

            switch (pilih) {
                case 1:
                    System.out.print("Masukkan NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Masukkan Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Masukkan Prodi: ");
                    String prodi = sc.nextLine();
                    MahasiswaQueue12 mhs = new MahasiswaQueue12(nim, nama, prodi);
                    antrian.enqueue(mhs);
                    break;
                case 2:
                    antrian.dequeue();
                    break;
                case 3:
                    antrian.printQueue();
                    break;
                case 4:
                    antrian.peekFront();
                    break;
                case 5:
                    antrian.peekRear();
                    break;
                case 6:
                    System.out.println("Jumlah antrian: " + antrian.getSize());
                    break;
                case 7:
                    antrian.clearQueue();
                    break;
                case 0:
                    System.out.println("Keluar program...");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }

        } while (pilih != 0);

        sc.close();
    }
}
