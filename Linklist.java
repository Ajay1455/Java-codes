import javax.swing.plaf.synth.SynthStyle;

class Linklist {
    Node head;
    Node tail;
    int size = 0;

    class Node {
        int data;
        Node next;

        Node(int x) {
            data = x;
            next = null;
        }
    }

    public void insertNode(int x) {
        Node n = new Node(x);
        head = n;
        tail = n;
        size++;
    }

    public void insertFirst(int x) {
        Node n = new Node(x);
        if (head == null) {
            insertNode(x);
        } else {
            n.next = head;
            head = n;
            size++;
        }
    }

    public void insertEnd(int x) {
        Node n = new Node(x);
        if (head == null) {
            insertNode(x);
        } else {
            tail.next = n;
            tail = n;
            size++;
        }
    }

    public int getData(int x) throws Exception {
        return getNode(x).data;
    }

    public Node getNode(int x) throws Exception {
        if (size <= x || size < 0) {
            throw new Exception("Pagal Linklist Khaali hai.");
        } else {
            Node temp = head;
            for (int i = 0; i < x; i++) {
                temp = temp.next;
            }
            return temp;

        }
        // return n;
    }

    public void insertAtIndex(int x, int index) throws Exception {
        Node n = new Node(x);
        if (head == null) {
            insertNode(x);
        }
        if (index == size) {
            insertEnd(x);
        } else {
            Node value = getNode(index - 1);
            n.next = value.next;
            value.next = n;
            size++;
        }

    }

    public void display() throws Exception {
        if(head ==null){
            System.out.print("Linklist is Empty.");
        }
        System.out.print("Head -> ");
        Node temp = head;
        for (; temp != null;) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.print("Tail ");
        System.out.println();

    }

    public void deleteFirst() {
        Node temp = head;
        head = head.next;
        temp.next = null;
        size--;
    }

    public void deleteLast() throws Exception {
        Node n = getNode(size - 2);
        n.next = null;
        tail.next = n;
        size--;
    }

    public void deleteIndex(int x) throws Exception {
        Node n = getNode(x - 1);
        Node temp = n.next;
        n.next = temp.next;
        temp.next = null;
    }

    public static void main(String[] args) throws Exception {
        Linklist list = new Linklist();
        list.insertFirst(5);
        list.insertEnd(9);
        list.insertAtIndex(10, 2);
        list.insertAtIndex(16, 2);
        list.display();
        // list=insert
        // Node li=new Node();
        // li.insertNode(5);
    }
}