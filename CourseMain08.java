public class CourseMain08 {
    public static void main(String[] args) {

        Course08 c1 = new Course08();
        c1 = new Course08("ALG101",
                          "Algoritma dan Struktur Data",
                          3,
                          4);

        System.out.println("=== Data Course 1 ===");
        c1.showInformation();
        c1.changeSKS(4);
        c1.addHours(2);
        c1.reduceHours(1);

        System.out.println();

        Course08 c2 = new Course08("PBO102",
                                   "Pemrograman Berorientasi Objek",
                                   3,
                                   2);

        System.out.println("=== Data Course 2 ===");
        c2.showInformation();
        c2.changeSKS(3);
        c2.addHours(1);
        c2.reduceHours(1);
    }
}