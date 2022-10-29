import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
    //Ввести 3 строки с консоли. Вывести на консоль те строки, длина которых меньше средней, а также их длину.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strings = new String[3];
        for (int i = 0; i < strings.length; i++) {
            System.out.println("Введите строку");
            strings[i] = scanner.nextLine();
        }
        Arrays.sort(strings);
        for (int i = 0; i < (strings.length / 2); i++) {
            System.out.println(strings[i]);
        }
    }
}
