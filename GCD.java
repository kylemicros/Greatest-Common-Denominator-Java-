public class GCD {
    public static void main(String[] args) {
        int a = 11;
        int b = 22;
        System.out.println("Results: " + a / gcd(a, b) + " / " + b / gcd(a, b));
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }
}
