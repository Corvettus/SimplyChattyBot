import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int classOne = scanner.nextInt();
        int classTwo = scanner.nextInt();
        int classThree = scanner.nextInt();
        System.out.println(classOne / 2 + classOne % 2 +
                classTwo / 2 + classTwo % 2 +
                classThree / 2 + classThree % 2);
    }
}