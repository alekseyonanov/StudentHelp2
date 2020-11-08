import java.util.Scanner;

public class Exc1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите действительное число x: ");
        double x = scanner.nextDouble();

        System.out.print("Введите действительное число y: ");
        double y = scanner.nextDouble();

        System.out.println("Сумма: " + (x + y));
        System.out.println("Разность: " + (x - y));
        System.out.println("Произведение: " + (x * y));
        System.out.println("Частное: " + (x / y));

        scanner.close();
    }
}
