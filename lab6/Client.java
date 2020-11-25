import java.net.Socket;
import java.util.Scanner;

class Client extends Thread {
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите n = ");
        int n = scanner.nextInt();
        scanner.close();

        try {
            Socket s = new Socket("127.0.0.1", 3128);

            s.getOutputStream().write(Integer.toString(n).getBytes());

            byte[] buf = new byte[64 * 1024];
            int r = s.getInputStream().read(buf);
            String data = new String(buf, 0, r);

            System.out.println("Результат = " + data);
        } catch (Exception e) {
            System.out.println("init error: " + e);
        }
    }
}
