import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 2;
        long fc = 1;
        long m = scanner.nextLong();

        while (fc * n <= m) {
            fc *= n;
            n++;
        }
        System.out.println(n);
    }
}