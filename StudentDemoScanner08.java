import java.util.Scanner;

public class StudentDemoScanner08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TopStudent08 topStudent = new TopStudent08(5); // FIX

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter student data into : " + (i + 1));

            System.out.print("NIM: ");
            String nim = sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Class: ");
            String studentClass = sc.nextLine();

            System.out.print("GPA: ");
            double gpa = Double.parseDouble(sc.nextLine()); // AMAN

            topStudent.add(new Student08(nim, name, studentClass, gpa));
            System.out.println();
        }

        System.out.println("Original student list:");
        topStudent.print();

        topStudent.bubbleSort();

        System.out.println("\nSorted student list (by GPA, descending):");
        topStudent.print();
    }
}