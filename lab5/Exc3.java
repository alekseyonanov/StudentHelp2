import java.util.Scanner;

public class Exc3 {
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

            int currentLength = 0;
            int deleteIndex = 0;
            String[] sorted = new String[words.length];

            for (int i = 0; i < words.length; i++) {
                for (int j = 0; j < words.length; j++) {
                    if(words[j].length() > currentLength){
                        currentLength = words[j].length();
                        deleteIndex = j;
                        sorted[words.length - i - 1] = words[j];
                    }
                }
                words[deleteIndex] = "";
                currentLength = 0;
            }

            for (int i = 0; i < sorted.length; i++) {
                System.out.println(sorted[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        } catch (NullPointerException e) {
            System.out.println(e);
        }

        scanner.close();
    }
}
