package Pertemuan12;

public class SLLMain12 {
    public static void main(String[] args) {
        SingleLinkedList12 sll = new SingleLinkedList12();
        Mahasiswa12 mhs1 = new Mahasiswa12("24212200", "Alvaro", "1A", 4.0);
        Mahasiswa12 mhs2 = new Mahasiswa12("22212202", "Cintia", "3C", 3.5);
        Mahasiswa12 mhs3 = new Mahasiswa12("23212201", "Bimon", "2B", 3.8);
        Mahasiswa12 mhs4 = new Mahasiswa12("21212203", "Dirga", "4D", 3.6);

        sll.addFirst(mhs4);
        sll.print();
        sll.addLast(mhs1);
        sll.print();

        sll.insertAfter("21212203", mhs3);
        sll.insertAt(2, mhs2);
        sll.print();

        System.out.println("Data indeks 1:");
        sll.getData(1);
        System.out.println("Data mahasiswa bernama Bimon berada pada indeks: " + sll.indexOf("Bimon"));
        sll.removeFirst();
        sll.removeLast();
        sll.print();
        sll.removeAt(0);
        sll.print();
    }
}