import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        checkNumber(clrearNumber(inputNumber()));
    }

    private static void checkNumber(String phoneNumber) {
        if (phoneNumber.length() > 11 || phoneNumber.length() < 10) {
            System.out.println("Неверный формат номера");
        } else if (phoneNumber.length() == 10 && phoneNumber.charAt(0) == '9') {
            System.out.println("7" + phoneNumber);
        } else if (phoneNumber.length() == 11 && phoneNumber.charAt(0) == '8') {
            phoneNumber = phoneNumber.replaceFirst("8", "7");
            System.out.println(phoneNumber);
        } else if (phoneNumber.length() == 10 && phoneNumber.charAt(0) != '9') {
            System.out.println("Неверный формат номера");
        } else {
            System.out.println(phoneNumber);
        }
    }

    private static String clrearNumber(String line) {
        final String REGEX_NUM = "[^0-9]";
        return line.replaceAll(REGEX_NUM, "");
    }

    private static String inputNumber() {
        return new Scanner(System.in).nextLine();
    }
}