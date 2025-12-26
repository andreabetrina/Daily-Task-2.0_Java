
// to generate the Fibonacci series
class Fibonacci {
    public static void main(String[] args) {
        int a = 0, b = 1, c;
        int n = 1005;   // number of termssss
        System.out.print(a + " " + b + " ");
        for (int i = 2; i < n; i++) {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
}



