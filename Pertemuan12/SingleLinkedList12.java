package Pertemuan12;
public class SingleLinkedList12 {
    Node12 head, tail;

    boolean isEmpty() {
        return head == null;
    }

    void print() {
        if (!isEmpty()) {
            Node12 tmp = head;
            System.out.println("Isi Linked List:");
            while (tmp != null) {
                tmp.data.tampilInformasi();
                tmp = tmp.next;
            }
        } else {
            System.out.println("Linked List Kosong");
        }
    }

    void addFirst(Mahasiswa12 input) {
        Node12 ndInput = new Node12(input, null);
        if (isEmpty()) {
            head = tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }

    void addLast(Mahasiswa12 input) {
        Node12 ndInput = new Node12(input, null);
        if (isEmpty()) {
            head = tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    void insertAfter(String nimKey, Mahasiswa12 input) {
        Node12 tmp = head;
        while (tmp != null && !tmp.data.nim.equals(nimKey)) {
            tmp = tmp.next;
        }
        if (tmp != null) {
            Node12 ndInput = new Node12(input, tmp.next);
            tmp.next = ndInput;
            if (tmp == tail) tail = ndInput;
        }
    }

    void insertAt(int index, Mahasiswa12 input) {
        if (index < 0) return;
        if (index == 0) addFirst(input);
        else {
            Node12 tmp = head;
            for (int i = 0; i < index - 1 && tmp != null; i++) {
                tmp = tmp.next;
            }
            if (tmp != null) {
                Node12 ndInput = new Node12(input, tmp.next);
                tmp.next = ndInput;
                if (tmp == tail) tail = ndInput;
            }
        }
    }
}
