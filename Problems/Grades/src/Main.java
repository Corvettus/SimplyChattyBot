import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] marksArray = {0, 0, 0, 0};
        for (int i = scanner.nextInt(); i > 0; i--) {
            marksArray[scanner.nextInt() - 2]++;
        }
        for (int mark :
                marksArray) {
            System.out.print(mark + " ");
        }
    }
}