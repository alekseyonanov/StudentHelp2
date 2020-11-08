import java.util.Scanner;

public class Exc2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите сторону куба: ");
        double side = scanner.nextDouble();

        System.out.println("Площадь грани: " + (side * side));
        System.out.println("Площадь поверхности: " + (6 * side * side));
        System.out.println("Объем: " + (side * side * side));

        scanner.close();
    }
}
