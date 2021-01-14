import java.util.Scanner;
import java.util.Stack;

public class Task3 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество строк: ");
        int count = scanner.nextInt() + 1;

        scanner.reset();
        System.out.println("Введите строки: ");
        for (int i = 0; i < count; i++) {
            stack.push(scanner.nextLine());
        }


        System.out.println("\nВведенные строки: ");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
