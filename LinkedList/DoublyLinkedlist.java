public class DoublyLinkedlist {
    Node head;
    Node tail;
    int size;

    private class Node {
        int val;
        Node next;
        Node prev;

        public Node(int val) {
            this.val = val;
        }
    }

    public DoublyLinkedlist() {
        head = null;
        tail = null;
        size = 0;
    }

    public void insertfirst(int val) {
        Node node = new Node(val);
        node.next = head;
        node.prev = null;

        if (head != null) {
            head.prev = node;
        }

        head = node;

        if (tail == null) {
            tail = head;
        }

        size++;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val);
            if (temp.next != null) {
                System.out.print(" <-> ");
            }
            temp = temp.next;
        }
        System.out.println(" -> end");
    }

    public void displayreverse() {
        if (tail == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = tail;
        while (temp != null) {
            System.out.print(temp.val);
            if (temp.prev != null) {
                System.out.print(" <-> ");
            }
            temp = temp.prev;
        }
        System.out.println(" -> start");
    }

    public void deletelast() {
        if (tail == null) {
            System.out.println("Nothing to delete");
            return;
        }

        if (tail.prev == null) {
            head = null;
            tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }

        size--;
    }
}
