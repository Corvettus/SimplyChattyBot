import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int daysNbr = scanner.nextInt();
        System.out.println(daysNbr * scanner.nextInt() + 2 * scanner.nextInt() + (daysNbr - 1) * scanner.nextInt());
    }
}