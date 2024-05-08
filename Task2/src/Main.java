import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        splitTextOnWords(getLine());
    }

    private static String getLine() {
        return new Scanner(System.in).nextLine();
    }

    private static void splitTextOnWords(String line) {
        final String REGEX = "[^a-zA-Z ]";
        String newLine = line.replaceAll(REGEX, "");
        String[] words = newLine.split(" ");
        if (words.length >= 100) {
            for (String word : words) {
                System.out.println(word);
            }
        } else {
            System.out.println("Слишком короткий текст.");
        }
    }
}