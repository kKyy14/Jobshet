import java.util.Scanner;

public class MainStudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input number of students: ");
        int jumlah = sc.nextInt();

        SearchStudent data = new SearchStudent(jumlah);

        System.out.println("---------------------------------");
        System.out.println("Input student data accordingly from smallest NIM");
        System.out.println("-----------");

        for (int i = 0; i < jumlah; i++) {
            System.out.println("----------");

            System.out.print("NIM      : ");
            int nim = sc.nextInt();
            sc.nextLine();

            System.out.print("Name     : ");
            String name = sc.nextLine();

            System.out.print("Age      : ");
            int age = sc.nextInt();

            System.out.print("GPA      : ");
            double gpa = sc.nextDouble();
            sc.nextLine();

            Students std = new Students(nim, name, age, gpa);
            data.add(std);
        }

        for (int i = 0; i < data.idx; i++) {
            data.listStd[i].display();
        }

        System.out.println("\nEntire Student Data");
        data.display();

        System.out.print("Search student by NIM: ");
        int search = sc.nextInt();

        System.out.println("Using Sequential Search");
        int pos = data.findSeqSearch(search);
        data.showPosition(search, pos);
        data.showData(search, pos);

        System.out.println("\nSearch student by NIM: Using Binary Search");
        int pos2 = data.findBinarySearch(search, 0, data.idx - 1);
        data.showPosition(search, pos2);
        data.showData(search, pos2);
    }
}