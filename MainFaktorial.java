import java.util.Scanner;

public class MainFaktorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BruteForceDivideConquer hasil = new BruteForceDivideConquer();

        System.out.print("Masukkan nilai: ");
        int n = sc.nextInt();

        System.out.println("Hasil factorial Brute Force: " + hasil.factorialBF(n));
        System.out.println("Hasil factorial Divide Conquer: " + hasil.factorialDC(n));
    }
}