import java.util.InputMismatchException;
import java.util.Scanner;

public class task1 {
    // Реализуйте метод, который запрашивает у пользователя ввод дробного числа
    // (типа float), и возвращает введенное значение.
    // Ввод текста вместо числа не должно приводить к падению приложения, вместо
    // этого, необходимо повторно запросить у пользователя ввод данных.

    public static void main(String[] args) {
        dataInput();
    }

    public static float dataInput() {
        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Введите дробное число:");
                float number = scanner.nextFloat();
                scanner.close();
                return number;
            } catch (InputMismatchException e) {
                System.out.println("Вы ввели не дробное число!Попробуйте еще раз:");
            }
        }
    }
}
