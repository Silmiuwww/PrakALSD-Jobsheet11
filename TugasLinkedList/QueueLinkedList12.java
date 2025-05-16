package TugasLinkedList;

public class QueueLinkedList12 {
    NodeQueue12 front, rear;
    int size = 0;

    public boolean isEmpty() {
        return front == null;
    }

    public void enqueue(MahasiswaQueue12 data) {
        NodeQueue12 newNode = new NodeQueue12(data);
        if (isEmpty()) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong, tidak ada yang bisa dipanggil.");
        } else {
            System.out.println("Mahasiswa dengan data berikut dipanggil:");
            front.data.tampil();
            front = front.next;
            size--;
            if (front == null) rear = null;
        }
    }

    public void printQueue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Daftar Antrian:");
            NodeQueue12 temp = front;
            while (temp != null) {
                temp.data.tampil();
                temp = temp.next;
            }
        }
    }

    public void peekFront() {
        if (!isEmpty()) {
            System.out.println("Antrian Terdepan:");
            front.data.tampil();
        } else {
            System.out.println("Antrian kosong.");
        }
    }

    public void peekRear() {
        if (!isEmpty()) {
            System.out.println("Antrian Terakhir:");
            rear.data.tampil();
        } else {
            System.out.println("Antrian kosong.");
        }
    }

    public void clearQueue() {
        front = rear = null;
        size = 0;
        System.out.println("Antrian telah dikosongkan.");
    }

    public int getSize() {
        return size;
    }
}
