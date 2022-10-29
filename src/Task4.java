import java.util.Scanner;

public class Task4 {//Ввести 3 строки с консоли. Найти слово, состоящее только из различных символов. Если таких слов несколько, найти первое из них.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strings = new String[3];
        for (int i = 0; i < strings.length; i++) {
            System.out.println("Введите строку");
            strings[i] = scanner.nextLine();
        }
        for (int i = 0; i < strings.length; i++) {
            char r = strings[i].charAt(0);
            for (int j = 1; j < strings[i].length(); j++) {// перебираем строку посимвольно
                if (strings[i].charAt(j) == r) {
                    break; // если находим повторку, выходим из перебора
                } else {
                    r = strings[i].charAt(j);
                }
            }
            if (r != strings[i].charAt(0) && r == strings[i].charAt(strings[i].length() - 1)) {
                System.out.println(strings[i]);
                break;
            }
        }
    }
}