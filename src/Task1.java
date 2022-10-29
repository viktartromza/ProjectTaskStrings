import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {//Ввести 3 строки с консоли, найти самую короткую и самую длинную строки. Вывести найденные строки и их длину.
        Scanner scanner = new Scanner(System.in);
        String[] strings = new String[3];
        int lengthMin = Integer.MAX_VALUE;
        int lengthMax = 0;
        String stringLong = new String();
        String stringShort = new String();
        for (int i = 0; i <strings.length; i++) {
            System.out.println("Введите строку");
            strings[i] = scanner.nextLine();
            if (strings[i].length() > lengthMax) {
                lengthMax = strings[i].length();
                stringLong = strings[i];
            }
            if (strings[i].length() < lengthMin) {
                lengthMin = strings[i].length();
                stringShort = strings[i];
            }
        }
        System.out.println("Самая короткая строка: " + stringShort);
        System.out.println("Ее длина: " + lengthMin);
        System.out.println("Самая длинная строка: " + stringLong);
        System.out.println("Ее длина: " + lengthMax);
    }
}