import java.util.Scanner;

public class KRSMainAssignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        KRSQueueAssignment queue = new KRSQueueAssignment(10);

        int choice;
         do{
            System.out.println("\n=== KRS Approval Menu ===");
            System.out.println("1. Add Student");
            System.out.println("2. Process 2 Students");
            System.out.println("3. Display All Queue");
            System.out.println("4. Display First Two Students");
            System.out.println("5. Display Rear Student");
            System.out.println("6. Queue Size");
            System.out.println("7. Processed Students");
            System.out.println("8. Remaining Students");
            System.out.println("9. Clear Queue");
            System.out.println("0. Exit");
            System.out.print("Choose menu: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch(choice){

                case 1:
                    System.out.print("NIM : ");
                    String nim = sc.nextLine();

                    System.out.print("Name : ");
                    String name = sc.nextLine();

                    System.out.print("Study Program : ");
                    String studyProgram = sc.nextLine();

                    System.out.print("Class : ");
                    String className = sc.nextLine();

                    StudentAssignment std = new StudentAssignment(nim, name, studyProgram, className);
                    queue.enqueue(std);
                    break;
                case 2:
                    System.out.println("Processing KRS approval...");

                    StudentAssignment s1 = queue.dequeue();
                    StudentAssignment s2 = queue.dequeue();
                    if(s1 != null){
                        s1.print();
                    }
                    if(s2 != null){
                        s2.print();
                    }
                    break;
                case 3:
                    queue.print();
                    break;
                case 4:
                    queue.printFirstTwo();
                    break;
                case 5:
                    queue.viewRear();
                    break;
                case 6:
                    System.out.println("Queue size: " + queue.size);
                    break;
                case 7:
                    System.out.println("Processed students: " + queue.processed);
                    break;
                case 8:
                    queue.remainingProcess();
                    break;
                case 9:
                    queue.clear();
                    break;
                case 0:
                    System.out.println("Thank you");
                    break;
                default:
                    System.out.println("Invalid menu");
            }
        }while(choice != 0);
    }
}