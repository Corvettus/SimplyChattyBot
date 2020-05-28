import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nbr = scanner.nextInt();
        System.out.println(nbr / 100 + nbr / 10 % 10  + nbr % 10);
    }
}