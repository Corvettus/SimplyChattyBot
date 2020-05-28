import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double m = scanner.nextInt();
        int p = scanner.nextInt();
        int k = scanner.nextInt();
        int yearsCount = 0;
        while (m < k) {
            yearsCount++;
            m += m * (double) p / 100;
        }
        System.out.println(yearsCount);
    }
}