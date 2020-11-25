import java.util.Scanner;

public class Exc1 {
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
                if(words[i].contains("E")){
                    words[i] = words[i].replace("E", "");
                }
                System.out.print(words[i] + " ");
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        } catch (NullPointerException e) {
            System.out.println(e);
        }

        scanner.close();
    }
}
