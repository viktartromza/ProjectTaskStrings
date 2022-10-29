import java.util.Arrays;
import java.util.Scanner;

import static java.util.Arrays.sort;

public class Task2 { // Ввести 3 строки с консоли. Упорядочить и вывести строки в порядке возрастания значений их длины.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strings = new String[3];
        for (int i = 0; i < strings.length; i++) {
            System.out.println("Введите строку");
            strings[i] = scanner.nextLine();
        }
        Arrays.sort(strings);
        for (String a : strings) {
            System.out.println(a);
        }
    }
}

