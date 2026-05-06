public class KRSQueueAssignment {

    StudentAssignment[] data;
    int front, rear, size, max;
    int processed = 0;

    public KRSQueueAssignment(int n){
        max = n;
        data = new StudentAssignment[max];
        size = 0;
        front = 0;
        rear = -1;
    }
    boolean isEmpty(){
        if(size == 0){
            return true;
        }else{
            return false;
        }
    }
    boolean isFull(){
        if(size == max){
            return true;
        }else{
            return false;
        }
    }
    void clear(){
        front = rear = -1;
        size = 0;
        System.out.println("Queue has been cleared");
    }
    void enqueue(StudentAssignment dt){
        if(isFull()){
            System.out.println("Queue is full!!!");
            return;
        }
        rear = (rear + 1) % max;
        data[rear] = dt;
        size++;
        System.out.println(dt.name + " successfully added to the queue");
    }
    StudentAssignment dequeue(){
        if(isEmpty()){
        System.out.println("Queue is empty!!!");
        return null;
        }
        StudentAssignment dt = data[front];
        front = (front + 1) % max;
        size--;
        processed++;
        return dt;
    }
    void print(){
        if(isEmpty()){
        System.out.println("Queue is empty!!!");
        return;
        }

        int i = front;

        while(i != rear){
        data[i].print();
        i = (i + 1) % max;
        }

        data[i].print();
    }
    void peekFront(){
        if(!isEmpty()){
        System.out.println("Front queue:");
        data[front].print();
        }else{
        System.out.println("Queue is empty!!!");
        }
    }
    void viewRear(){
        if(!isEmpty()){
        System.out.println("Rear queue:");
        data[rear].print();
        }else{
        System.out.println("Queue is empty!!!");
        }
    }
    void printFirstTwo(){
        if(size >= 2){
        System.out.println("First student:");
        data[front].print();

        System.out.println("Second student:");
        data[(front + 1) % max].print();
        }else{
        System.out.println("Not enough students in queue");
        }
    }
    void remainingProcess(){
    System.out.println("Students not yet processed: " + (30 - processed));
    }
}