import java.util.Scanner;

public class Task5 {//Ввести 3 строки с консоли. Среди слов, состоящих только из цифр, найти слово-палиндром.


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strings = new String[3];
        for (int i = 0; i < strings.length; i++) {
            System.out.println("Введите строку, состоящую из цифр");
            try {
                strings[i] = String.valueOf(scanner.nextInt());
            } catch (Exception e) {
                System.out.println("Вы ввели не цифру. Запустите задачу заново");
                break;
            }
        }
        for (String string : strings) {
            StringBuilder stringNew = new StringBuilder(string);
            if (String.valueOf(stringNew.reverse()).equals(string)) {
                System.out.println("Вы ввели слово-палиндром: " + string);
            }
        }
    }
}