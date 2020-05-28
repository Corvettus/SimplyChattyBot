import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        if (start % 3 != 0) {
            if (start > 0) {
                start += 3 - start % 3;
            } else {
                start -= start % 3;
            }
        }
        if (end % 3 != 0) {
            if (end >= 0) {
                end -= end % 3;
            } else {
                end -= 3 + (end % 3);
            }
        }
        System.out.print((start + end) / 2);
        if ((start + end) % 2 != 0) {
            System.out.print(".5");
        }
    }
}