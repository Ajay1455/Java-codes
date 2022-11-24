public class Queue {
    int size;
    int arraySize;
    int arr[];
    int front;

    Queue(){
        
    }
    Queue(int arraySize) {
        this.size = 0;
        this.arr = new int[arraySize];
        this.front = 0;
    }

    public void Enque(int x) throws Exception {
        if (!isFull()) {
            arr[(front + size) % arr.length] = x;
            size++;
            System.out.println("Enque Element : " + x);
        } else {
            // System.out.println("Stack is full !");
            throw new Exception("Queue full ho gya hai");
        }
    }

    public void Deque() throws Exception {
        if (!isEmpty()) {
            System.out.println("Deque Element :" + arr[(front + size) % arr.length]);
            front++;
        } else {
            // System.out.println("Stack is empty !");
            throw new Exception("Queue Khaali hai.");
        }
    }

    public int queueFront() {
        if (!this.isEmpty())
            return arr[front];
        else {
            System.out.println("Queue is Empty");
            return -1;
        }
    }

    public boolean isEmpty() {
        return (size == 0 && front==0);
    }

    public boolean isFull() {
        return (size == arr.length);
    }

    public void display() {
        System.out.print("Queue Elements : ");
        for (int i = front; i!=size; i=(1+i)%arr.length) {
            // System.out.print( arr[(front + i) % arr.length] + " ");
            System.out.print(arr[i]+" ");
        }System.out.println();
    }

    public static void main(String[] args) throws Exception {
        Queue q1 = new Queue(6);
        // Stack.pop();
        System.out.println("-----We are going to Enque element");
        q1.Enque(10);
        q1.Enque(20);
        q1.Enque(30);
        q1.Enque(40);
        q1.Enque(50);
        q1.Enque(60);
        System.out.println("=================");
        // q1.display();
        System.out.println("-----We are going to Deque element");
        q1.Deque();
        q1.Deque();
        q1.Deque();
        System.out.println("=================");
        // q1.display();
    }
}
