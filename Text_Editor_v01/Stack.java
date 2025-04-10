public class Stack {

    private Node top;

    public Stack() {
        this.top = null;
    }

    public void DisplayStack() {
        if (top == null) {
            System.out.println("Undo stack is empty !!!");
        } else {
            System.out.println("Undo stack in order...");
            Node current = top;
            while (current != null) {
                System.out.print(current.data);
                current = current.next;
            }
        }
    }

    public void push(Action action) {
        if (top == null) {
            top = new Node(action, null);
        } else {
            top = new Node(action, top);
        }
    }

    public Action pop() {
        if (top == null) {
            System.out.println("Nothing to undo !!!");
            return null;
        } else {
            Action temp = top.data;
            top = top.next;
            return temp;
        }
    }

}
