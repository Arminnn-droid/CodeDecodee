import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner feelScanner = new Scanner(System.in);
        System.out.println("Well, how are you today?!");
        String feelings = feelScanner.nextLine();
        System.out.println("Well, you're: " + feelings);

    }
}