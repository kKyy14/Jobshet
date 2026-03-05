import java.util.Scanner;

public class DosenDemo08 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah dosen: ");
        int jml = Integer.parseInt(sc.nextLine());

        // array of object
        Dosen08[] arrayOfDosen = new Dosen08[jml];
        String dummy;

        // input data dosen
        for (int i = 0; i < jml; i++) {

            System.out.println("Masukkan Data Dosen ke-" + (i + 1));

            System.out.print("Code   : ");
            String code = sc.nextLine();

            System.out.print("Name   : ");
            String name = sc.nextLine();

            System.out.print("Gender (M/F): ");
            String g = sc.nextLine();
            boolean gender = g.equalsIgnoreCase("M");

            System.out.print("Age    : ");
            dummy = sc.nextLine();
            int age = Integer.parseInt(dummy);

            System.out.println("-----------------------------------");

            arrayOfDosen[i] = new Dosen08(code, name, gender, age);
        }

        // tampil data dengan foreach
        System.out.println("\n===== DATA DOSEN =====");
        for (Dosen08 d : arrayOfDosen) {
            d.printInfo();
        }

        // object DataDosen
        DataDosen08 data = new DataDosen08();

        data.dataAllDosen(arrayOfDosen);
        data.numberOfLecturersPerGender(arrayOfDosen);
        data.averageAgeOfLecturersPerGender(arrayOfDosen);
        data.infoDosenPalingTua(arrayOfDosen);
        data.infoDosenPalingMuda(arrayOfDosen);

        sc.close();
    }
}