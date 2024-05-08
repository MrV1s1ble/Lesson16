import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите ФИО: ");
        checkIfContainRusLetters(getLine());
    }

    private static void checkIfContainRusLetters(String test) {
        //регулярное выражение для проверки на русские буквы
        final String REGEX_CHECK = "((([А-яёЁ]+)|([А-яёЁ-]+))\\s){2}(([А-яёЁ]+)|([А-яёЁ-]+))";
        String[] newFIO = test.split(" ");

        if (test.matches(REGEX_CHECK)) {
            System.out.println("Фамилия: " + newFIO[0]);
            System.out.println("Имя: " + newFIO[1]);
            System.out.println("Отчество: " + newFIO[2]);
        } else {
            System.out.println("Введенная строка не является ФИО.");
        }
    }

    private static String getLine() {
        return new Scanner(System.in).nextLine();
    }
}