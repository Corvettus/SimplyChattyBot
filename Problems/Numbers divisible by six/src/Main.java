import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        for (int i = scanner.nextInt(); i > 0; i--) {
            int nbr = scanner.nextInt();
            if (nbr % 6 == 0) {
                sum += nbr;
            }
        }
        System.out.println(sum);
    }
}