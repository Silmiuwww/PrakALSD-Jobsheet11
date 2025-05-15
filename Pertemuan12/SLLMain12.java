package Pertemuan12;

import java.util.Scanner;

public class SLLMain12 {
    public static void main(String[] args) {
        SingleLinkedList12 sll = new SingleLinkedList12();

        Mahasiswa12 mhs1 = new Mahasiswa12("21212203", "Dirga", "4D", 3.6);
        Mahasiswa12 mhs2 = new Mahasiswa12("24212200", "Alvaro", "1A", 4.0);
        Mahasiswa12 mhs3 = new Mahasiswa12("22212202", "Cintia", "3C", 3.5);
        Mahasiswa12 mhs4 = new Mahasiswa12("23212201", "Bimon", "2B", 3.8);

        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan NIM: ");
        String nim = sc.nextLine();
        System.out.print("Masukkan Nama: ");
        String nama = sc.nextLine();
        System.out.print("Masukkan Kelas: ");
        String kelas = sc.nextLine();
        System.out.print("Masukkan IPK: ");
        double ipk = sc.nextDouble();
        Mahasiswa12 mhs = new Mahasiswa12(nim, nama, kelas, ipk);
        sll.addFirst(mhs);

    }
}
