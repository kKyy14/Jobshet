public class Course08 {

    private String kodeCourse;
    private String name;
    private int SKS;
    private int numberOfHours;

    public Course08() {
        kodeCourse = "-";
        name = "-";
        SKS = 0;
        numberOfHours = 0;
    }

    public Course08(String kodeCourse, String name, int SKS, int numberOfHours) {
        this.kodeCourse = kodeCourse;
        this.name = name;

        if (SKS > 0 && SKS <= 6) {
            this.SKS = SKS;
        } else {
            System.out.println("SKS tidak valid. Diset ke 0.");
            this.SKS = 0;
        }

        this.numberOfHours = numberOfHours;
    }

    public void showInformation() {
        System.out.println("Kode Course     : " + kodeCourse);
        System.out.println("Nama Course     : " + name);
        System.out.println("SKS             : " + SKS);
        System.out.println("Jumlah Jam/Mgg  : " + numberOfHours);
        System.out.println("-----------------------------------");
    }

    public void changeSKS(int sksNew) {
        if (sksNew > 0 && sksNew <= 6) {
            this.SKS = sksNew;
            System.out.println("SKS berhasil diubah menjadi " + SKS);
        } else {
            System.out.println("Perubahan gagal. SKS harus antara 1 - 6.");
        }
    }

    public void addHours(int hours) {
        numberOfHours += hours;
        System.out.println("Jam berhasil ditambah. Total jam: " + numberOfHours);
    }

    public void reduceHours(int hours) {
        if (hours <= numberOfHours) {
            numberOfHours -= hours;
            System.out.println("Jam berhasil dikurangi. Sisa jam: " + numberOfHours);
        } else {
            System.out.println("Pengurangan gagal. Jam tidak mencukupi.");
        }
    }
}