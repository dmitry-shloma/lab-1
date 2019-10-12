import java.util.Scanner;

public class Console {

    public Console(String msg) {
        System.out.print(msg);
    }

    public String readLine() {
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }
}
