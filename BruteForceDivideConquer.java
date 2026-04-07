public class BruteForceDivideConquer {

    long factorialBF(int n) {
        long facto = 1;
        for (int i = 1; i <= n; i++) {
            facto = facto * i;
        }
        return facto;
    }

    long factorialDC(int n) {
        if (n == 1 || n == 0) {
            return 1;
        } else {
            return n * factorialDC(n - 1);
        }
    }
}