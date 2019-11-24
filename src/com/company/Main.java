package com.company;

import java.util.ArrayList;
import java.util.List;

/**бинарный поиск
 * есть лист, элементы которого отсортированы по возрастанию,
 * написать метод, который принимает лист и целое число
 * если число есть в листе, метод должен вернуть его индекс
 * если нет, то вернуть минус 1
 * ????????вернуть первый встретившийся индекс? если будет два одинаковых числа в листе?
 */
public class Main {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            list.add(i);
        }
        list.add(11);
        list.add(11);
        System.out.println(list);
        System.out.println(isNumberInList(11, list));
    }
    public static int isNumberInList(int guessedNumber, List<Integer> list) {
        int lowerBorder = 0;
        int upperBorder = list.size() -1;
        if ((guessedNumber > list.get(upperBorder)) || (guessedNumber < list.get(lowerBorder))) {
            return -1;
        }
        for (int i = 0; i < list.size() -1; i++) {
            if (guessedNumber == list.get(upperBorder)) {
                return upperBorder;
            }
            if (guessedNumber == list.get(lowerBorder)) {
                return lowerBorder;
            }
            int index = (lowerBorder + upperBorder) / 2;
                System.out.println("середина " + index);
            if (list.get(index) == guessedNumber) {
                return index;
            } else if (list.get(index) > guessedNumber) {
                upperBorder = index;
                System.out.println("верхняя граница " + upperBorder);
            } else if (list.get(index) < guessedNumber) {
                lowerBorder = index;
                System.out.println("нижняя граница " + lowerBorder);
            }
            if (upperBorder - lowerBorder == 1) {
                return -1;
            }
        }
        // ????? не понимаю, зачем тут писать -1, но без нее не работает
        return -1;
    }
}


