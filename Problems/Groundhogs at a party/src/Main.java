import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        boolean weekend = scanner.nextBoolean();
        if (!weekend && count >= 10 && count <= 20) {
            System.out.println(true);
        } else if (weekend && count >= 15 && count <= 25) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}