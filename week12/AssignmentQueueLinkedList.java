public class AssignmentQueueLinkedList {

    AssignmentNode front;
    AssignmentNode rear;
    int size;

    boolean isEmpty() {
        return front == null;
    }

    boolean isFull() {
        return false;
    }

    void clear() {
        front = rear = null;
        size = 0;
        System.out.println("Queue has been cleared");
    }

    void enqueue(AssignmentStudent data) {

        AssignmentNode newNode = new AssignmentNode(data, null);

        if (isEmpty()) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }

        size++;
    }

    void dequeue() {

        if (isEmpty()) {
            System.out.println("Queue is empty");
        } else {

            System.out.println("Student being served:");
            front.data.print();

            front = front.next;
            size--;

            if (front == null) {
                rear = null;
            }
        }
    }

    void peekFront() {

        if (!isEmpty()) {
            System.out.println("Front Queue:");
            front.data.print();
        }
    }

    void peekRear() {

        if (!isEmpty()) {
            System.out.println("Rear Queue:");
            rear.data.print();
        }
    }

    void printQueue() {

        if (isEmpty()) {
            System.out.println("Queue is empty");
        } else {

            AssignmentNode temp = front;

            System.out.println("Canteen Queue:");

            while (temp != null) {
                temp.data.print();
                temp = temp.next;
            }
        }
    }

    void totalQueue() {
        System.out.println("Total students in queue: " + size);
    }
}