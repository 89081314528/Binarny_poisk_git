package com.company;

import java.util.ArrayList;
import java.util.List;

/**бинарный поиск
 * есть лист, элементы которого отсортированы по возрастанию,
 * написать метод, который принимает лист и целое число
 * если число есть в листе, метод должен вернуть его индекс
 * если нет, то вернуть минус 1
 * вернуть первый встретившийся индекс? если будет два одинаковых числа в листе?
 */
public class Main {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        System.out.println(list);
        System.out.println(isNumberInList(5, list));
        System.out.println(isNumberInList(7, list));
        System.out.println(isNumberInList(-1, list));
        System.out.println(isNumberInList(10, list));
    }

    public static int isNumberInList(int guessedNumber, List<Integer> list) {
        int lowerBorder = list.get(0);
        int upperBorder = list.get(list.size() - 1);
        for (int i = 0; i < list.size(); i++) {
            int number = (lowerBorder + upperBorder) / 2;
            if ((guessedNumber > upperBorder) || (guessedNumber < lowerBorder)) {
                return -1;
            } else if (number == guessedNumber) {
                return list.indexOf(number);
            } else if (number > guessedNumber) {
                upperBorder = number;
            } else if (number < guessedNumber) {
                lowerBorder = number;
            }
        }
        return -1;
    }
}


