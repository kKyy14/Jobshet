import java.util.Scanner;

public class ExcuseLetterDemo08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ExcuseLetterStack08 stack = new ExcuseLetterStack08(5);
        int pilihan;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Input Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Terakhir");
            System.out.println("4. Cari Surat");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilihan = scan.nextInt();
            scan.nextLine();

            switch(pilihan){

                case 1:
                    System.out.print("ID: ");
                    String id = scan.nextLine();

                    System.out.print("Nama: ");
                    String name = scan.nextLine();

                    System.out.print("Kelas: ");
                    String className = scan.nextLine();

                    System.out.print("Jenis (S/I): ");
                    char type = scan.next().charAt(0);

                    System.out.print("Durasi (hari): ");
                    int duration = scan.nextInt();
                    scan.nextLine();

                    ExcuseLetter08 surat = new ExcuseLetter08(id, name, className, type, duration);
                    stack.push(surat);

                    System.out.println("Surat berhasil ditambahkan!");
                    break;

                case 2:
                    ExcuseLetter08 proses = stack.pop();
                    if(proses != null){
                        System.out.println("Memproses surat dari " + proses.name);
                    }
                    break;

                case 3:
                    ExcuseLetter08 top = stack.peek();
                    if(top != null){
                        System.out.println("Surat terakhir dari " + top.name);
                    }
                    break;

                case 4:
                    System.out.print("Masukkan nama yang dicari: ");
                    String cari = scan.nextLine();
                    stack.search(cari);
                    break;

                case 0:
                    System.out.println("Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }

        } while(pilihan != 0);
    }
}