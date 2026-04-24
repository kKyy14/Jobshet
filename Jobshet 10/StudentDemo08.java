import java.util.Scanner;

public class StudentDemo08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        StudentAssignmentStack08 stack = new StudentAssignmentStack08(5);

        int pilih;

        do {
            System.out.println("\nMenu: ");
            System.out.println("1. Mengumpulkan Tugas");
            System.out.println("2. Menilai Tugas");
            System.out.println("3. Melihat Tugas Teratas");
            System.out.println("4. Melihat Daftar Tugas");
            System.out.print("Pilih: ");
            pilih = scan.nextInt();
            scan.nextLine();
            switch (pilih) {
                case 1:
                    System.out.print("Nama: ");
                    String nama = scan.nextLine();
                    System.out.print("NIM: ");
                    String nim = scan.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = scan.nextLine();

                    Student08 mhs = new Student08(nim, nama, kelas);
                    stack.push(mhs);

                    System.out.printf("Tugas %s berhasil dikumpulkan\n!", nama);
                    break;

                case 2:
                    Student08 dinilai = stack.pop();
                    if (dinilai != null) {
                        System.out.println("Menilai tugas dari " + dinilai.name);
                        System.out.print("Masukkan nilai (0-100): ");
                        int nilai = scan.nextInt();
                        dinilai.grading(nilai);

                        System.out.printf("Nilai Tugas %s adalah %d\n", dinilai.name, nilai);
                        String binary = stack.convertToBinary(nilai);
                        System.out.printf("Assignment grade in binary is %s\n", binary);

                    }
                    break;

                case 3:
                    Student08 lihat = stack.peek();
                    if (lihat != null) {
                        System.out.println("Tugas terakhir dikumpulkan oleh " + lihat.name);
                    }
                    break;

                case 4:
                    System.out.println("Daftar semua tugas");
                    System.out.println("NIM\tNama\tKelas");
                    stack.print();
                    break;

                case 0:
                    System.out.println("Program selesai");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }

        } while (pilih != 0);
    }
}