import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        char sign = scanner.next().charAt(0);
        long b = scanner.nextLong();
        System.out.println(calc(a, sign, b));
    }

    private static String calc(long a, char sign, long b) {
        switch (sign) {
            case '+':
                return Long.toString(a + b);
            case '-':
                return Long.toString(a - b);
            case '*':
                return Long.toString(a * b);
            case '/':
                if (b == 0) {
                    return "Division by 0!";
                }
                return Long.toString(a / b);
            default:
                return "Unknown operator";
        }
    }
}