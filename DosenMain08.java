public class DosenMain08 {
    public static void main(String[] args) {

        Lecturer08 dsn1 = new Lecturer08();
        dsn1 = new Lecturer08("dsn1", "AHMAD FARRIJ", true, 2019, "Struktur Data");

        System.out.println("=== DATA DOSEN 1 ===");
        dsn1.displayInformation();
        dsn1.setStatusActive(false);
        System.out.println("Masa Kerja: " + dsn1.calculateTimeWork(2026) + " tahun");
        dsn1.changeSkill("Algoritma");
        dsn1.displayInformation();

        System.out.println();

        Lecturer08 dsn2 = new Lecturer08("dsn2", "ivander arya", true, 2020, "Basis Data");

        System.out.println("=== DATA DOSEN 2 ===");
        dsn2.displayInformation();
        dsn2.setStatusActive(true);
        System.out.println("Masa Kerja: " + dsn2.calculateTimeWork(2026) + " tahun");
        dsn2.changeSkill("Pemrograman Web");
        dsn2.displayInformation();
    }
}