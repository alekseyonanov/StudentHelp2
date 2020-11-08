import java.util.Scanner;

public class Exc3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите сторону равностороннего треугольника: ");
        double side = scanner.nextDouble();

        System.out.println("Площадь треугольника: " + (side * side * Math.sqrt(3) / 4));
        System.out.println("Высота треугольника: " + (side * Math.sqrt(3) / 2));
        System.out.println("Радиус вписанной окружности: " + (side * Math.sqrt(3) / 6));
        System.out.println("Радиус описанной окружности: " + (side * Math.sqrt(3) / 3));

        scanner.close();
    }
}
