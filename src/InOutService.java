import java.util.Scanner;

public class InOutService {
    public static String inputLine() {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextLine()) {
            return sc.nextLine();
        } else {
            System.out.println("Not correct. Enter a word");
            return inputLine();
        }
    }

    public static int inputInt() {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            return sc.nextInt();
        } else {
            System.out.println("Not correct. Enter a number");
            return inputInt();
        }
    }
}