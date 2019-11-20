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
        list.add(5);
        System.out.println(list);
        System.out.println(isNumberInList(list, 5));
    }

    public static int isNumberInList (List <Integer> list, int number) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == number) {
                return i;
            }
        }
        return -1;
    }
}
