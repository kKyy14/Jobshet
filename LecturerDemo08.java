import java.util.Scanner;

public class LecturerDemo08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LecturerData08 data = new LecturerData08();
        int choice;

        do {
            System.out.println("\nMENU:");
            System.out.println("1. Add Data");
            System.out.println("2. Display Data");
            System.out.println("3. Sort ASC (Youngest to Oldest)");
            System.out.println("4. Sort DSC (Oldest to Youngest)");
            System.out.println("0. Exit");
            System.out.print("Choose: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("ID: ");
                    String id = sc.nextLine();

                    System.out.print("Name: ");
                    String name = sc.nextLine();

                    System.out.print("Gender (true=Male, false=Female): ");
                    boolean gender = sc.nextBoolean();

                    System.out.print("Age: ");
                    int age = sc.nextInt();
                    sc.nextLine();

                    data.add(new Lecturer08(id, name, gender, age));
                    break;

                case 2:
                    data.print();
                    break;

                case 3:
                    data.sortingASC();
                    System.out.println("Sorted ASC:");
                    data.print();
                    break;

                case 4:
                    data.sortingDSC();
                    System.out.println("Sorted DSC:");
                    data.print();
                    break;

                case 0:
                    System.out.println("Exit program");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 0);
    }
}