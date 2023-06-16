import java.util.Scanner;

public class task4 {
    // Разработайте программу, которая выбросит Exception, когда пользователь вводит
    // пустую строку.
    // Пользователю должно показаться сообщение, что пустые строки вводить нельзя.

    public static void main(String[] args) {
        emptyString();
    }

    public static void emptyString() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст:");
        String str = scanner.nextLine();
        scanner.close();
        if (str == null || str.isEmpty()) {
            throw new RuntimeException("Вы ввели пустую строку!Так делать нельзя!");
        }
    }
}
