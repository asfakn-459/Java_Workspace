import java.util.Scanner;

public class Java_17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String input = scan.nextLine();

        String get = swapcase(input);
        System.out.print("SwapCase: " + get);
    }

    private static String swapcase(String str) {
        StringBuilder swapped = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (Character.isUpperCase(c)) {
                swapped.append(Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                swapped.append(Character.toUpperCase(c));
            } else {
                swapped.append(c);
            }
        }
        return swapped.toString();
    }
}
