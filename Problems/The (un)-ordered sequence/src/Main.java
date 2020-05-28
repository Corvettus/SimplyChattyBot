import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int prev = scanner.nextInt();
        int nbr;
        int order = 0;
        while (prev != 0) {
            if ((nbr = scanner.nextInt()) == 0) {
                break;
            }
            if (order == 0) {
                if (nbr > prev) {
                    order = 1;
                } else if (nbr < prev) {
                    order = -1;
                }
            } else if (order == -1 && nbr > prev || order == 1 && nbr < prev) {
                System.out.println(false);
                return;
            }
            prev = nbr;
        }
        System.out.println(true);
    }
}
