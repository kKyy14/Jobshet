public class StudentDemo08 {
    public static void main(String[] args) {

        TopStudent08 topStudents = new TopStudent08(5);

        // Adding student data
        topStudents.add(new Student08("2201", "Alice", "A", 3.9));
        topStudents.add(new Student08("2202", "Bob", "B", 3.7));
        topStudents.add(new Student08("2203", "Charlie", "C", 3.8));
        topStudents.add(new Student08("2204", "David", "D", 3.6));
        topStudents.add(new Student08("2205", "Eve", "E", 4.0));

        // Selection Sort (ascending)
        topStudents.selectionSort();
        System.out.println("\nSorted student list (by GPA, ascending) using Selection Sort:");
        topStudents.print();

        // Insertion Sort (ascending)
        topStudents.insertionSort();
        System.out.println("\nSorted student list (by GPA, ascending) using Insertion Sort:");
        topStudents.print();
    }
}