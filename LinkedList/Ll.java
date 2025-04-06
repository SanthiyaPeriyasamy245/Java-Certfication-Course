public class Ll {

    Node head;
    Node tail;
    int size;

    private class Node {
        int val;
        Node next;

        private Node(int val) {
            this.val = val;
        }

        private Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }

    public Ll() {
        this.size = 0;
    }

    public void addfirst(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = node;
            tail = node;
        } else {
            node.next = head;
            head = node;
        }
        size++;
    }

    public void addlast(int val) {
        if (tail == null) {
            addfirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("end");
    }

    public void insert(int val, int index) {
        if (index == 0) {
            addfirst(val);
            return;
        }
        if (index == size) {
            addlast(val);
            return;
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(val, temp.next);
        temp.next = node;
        size++;
    }

    public int size() {
        return size;
    }

    public void deletefirst() {
        if (head == null) return;

        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
    }

    public void deletelast() {
        if (head == null) {
            System.out.println("Nothing to delete");
            return;
        }

        if (head.next == null) {
            head = null;
            tail = null;
            size--;
            return;
        }

        Node temp = head;
        while (temp.next != tail) {
            temp = temp.next;
        }
        temp.next = null;
        tail = temp;
        size--;
    }

    public void delete(int index) {
        if (index == 0) {
            deletefirst();
            return;
        }
        if (index == size - 1) {
            deletelast();
            return;
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        size--;
    }
}
