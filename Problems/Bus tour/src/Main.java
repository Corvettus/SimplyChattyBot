import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int busHeight = scanner.nextInt();
        int n = scanner.nextInt();
        int bridgeHeight;
        for (int i = 1; i <= n; i++) {
            bridgeHeight = scanner.nextInt();
            if (bridgeHeight <= busHeight) {
                System.out.println("Will crash on bridge " + i);
                return;
            }
        }
        System.out.println("Will not crash");
    }
}