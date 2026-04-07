import java.util.Scanner;

public class PowerMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input number of elements: ");
        int elemen = input.nextInt();

        Power[] png = new Power[elemen];

        for (int i = 0; i < elemen; i++) {
            System.out.print("Input base number for element " + (i + 1) + ": ");
            int base = input.nextInt();

            System.out.print("Input exponent for element " + (i + 1) + ": ");
            int exp = input.nextInt();

            png[i] = new Power(base, exp);
        }

        System.out.println();
        System.out.println("POWER RESULT USING BRUTEFORCE:");
        for (Power p : png) {
            System.out.println(p.baseNumber + "^" + p.exponent + ": " + p.powerBF(p.baseNumber, p.exponent));
        }

        System.out.println();
        System.out.println("POWER RESULT USING DIVIDE AND CONQUER:");
        for (Power p : png) {
            System.out.println(p.baseNumber + "^" + p.exponent + ": " + p.powerDC(p.baseNumber, p.exponent));
        }
    }
}