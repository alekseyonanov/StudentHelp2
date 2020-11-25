import java.util.Scanner;

public class Exc2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String line = scanner.nextLine();

        try {
            if (line.length() == 0)
                throw new Exception("Пустая строка");

        } catch (Exception e) {
            System.out.println(e);
        }

        String[] words = line.split(" ");

        try {

            for (int i = 0; i < words.length; i++) {
                char[] array = words[i].toCharArray();
                boolean isAlphabetical = true;
                for (int j = 1; j < array.length; j++) {
                    if (array[j - 1] >= array[j]) {
                        isAlphabetical = false;
                        break;
                    }
                }
                if (isAlphabetical) {
                    System.out.println("Слово, все буквы которого в алфавитном порядке: " + words[i]);
                }
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        } catch (NullPointerException e) {
            System.out.println(e);
        }

        scanner.close();
    }
}
