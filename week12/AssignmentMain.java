import java.util.Scanner;

public class AssignmentMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        AssignmentQueueLinkedList queue = new AssignmentQueueLinkedList();

        int menu;

        do {

            System.out.println("\n=== CANTEEN QUEUE SYSTEM ===");
            System.out.println("1. Add Student to Queue");
            System.out.println("2. Call Next Student");
            System.out.println("3. Show Front Queue");
            System.out.println("4. Show Rear Queue");
            System.out.println("5. Show All Queue");
            System.out.println("6. Total Queue");
            System.out.println("7. Clear Queue");
            System.out.println("0. Exit");

            System.out.print("Choose menu: ");
            menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {

                case 1:

                    System.out.print("Input NIM   : ");
                    String nim = sc.nextLine();

                    System.out.print("Input Name  : ");
                    String name = sc.nextLine();

                    System.out.print("Food Order  : ");
                    String menuFood = sc.nextLine();

                    AssignmentStudent std = new AssignmentStudent(nim, name, menuFood);

                    queue.enqueue(std);

                    System.out.println("Student added to canteen queue");
                    break;

                case 2:
                    queue.dequeue();
                    break;

                case 3:
                    queue.peekFront();
                    break;

                case 4:
                    queue.peekRear();
                    break;

                case 5:
                    queue.printQueue();
                    break;

                case 6:
                    queue.totalQueue();
                    break;

                case 7:
                    queue.clear();
                    break;

                case 0:
                    System.out.println("THANK YOU");
                    break;

                default:
                    System.out.println("Invalid menu");
            }

        } while (menu != 0);
    }
}