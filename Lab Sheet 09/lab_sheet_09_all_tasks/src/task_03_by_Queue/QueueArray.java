package task_03_by_Queue;

public class QueueArray {

    private final int maxSize;
    private final String[] queueArray;
    private int front;
    private int rear;
    private int nItems;

    // Constructor
    public QueueArray(int maxSize) {
        this.maxSize = maxSize;
        queueArray = new String[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }

    // Insert from rear
    public void insertCustomer(String newCustomer) {
        if (isFull()) {
            System.out.println("Customer queue is full");
        } else {
            queueArray[++rear] = newCustomer;
            nItems++;
        }
    }

    // Delete from front
    public String removeCustomer() {
        if (isEmpty()) {
            System.out.println("Customer queue is empty");
            return null;
        } else {
            nItems--;
            return queueArray[front++];
        }
    }

    // Check if empty
    public boolean isEmpty() {
        return nItems == 0;
    }

    // Check if full
    public boolean isFull() {
        return nItems == maxSize;
    }

    // Peek the front
    public String peek() {
        if (isEmpty()) {
            System.out.println("Customer queue is empty");
            return null;
        } else {
            return queueArray[front];
        }
    }

    // print the current queue
    public void printCustomerQueue() {
        if (isEmpty()) {
            System.out.println("Customer queue is empty");
        } else {
            for (int i=front; i<=rear; i++) {
                System.out.print(queueArray[i] + ((i==rear)? "\n":"<--"));
            }
            System.out.println();
        }
    }
}
