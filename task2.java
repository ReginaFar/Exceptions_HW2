public class task2 {
    public static void main(String[] args) {
        correctedCode();
    }

    public static void correctedCode() {
        try {
            int[] intArray = new int[] { 1, 2, 3, 4, 5, 6, 7 };
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Catching exception: " + e);
        }
    }
    // Создала массив, также добавила исключение ArrayIndexOutOfBoundsException,
    // которое выбрасывается при обращении к элементу массива, который не
    // существует.

}
