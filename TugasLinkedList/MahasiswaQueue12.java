package TugasLinkedList;

public class MahasiswaQueue12 {
    String nim, nama, prodi;

    public MahasiswaQueue12(String nim, String nama, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
    }

    public void tampil() {
        System.out.println("NIM  : " + nim);
        System.out.println("Nama : " + nama);
        System.out.println("Prodi: " + prodi);
        System.out.println("-----------------------------");
    }
}

