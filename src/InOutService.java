import java.util.Scanner;

public class InOutService {
    public static String inputLine() {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextLine()) {
            return sc.nextLine();
        } else {
            return inputLine();
        }
    }

    public static int inputInt() {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            return sc.nextInt();
        } else {
            return inputInt();
        }
    }
}