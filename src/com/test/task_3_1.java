package com.test;

/**
 * Задача 3 (первая часть)
 * При помощи цикла for вывести на экран нечетные числа от 1 до 99
 * Переписать с использованием цикла while
 */

public class task_3_1 {
    public static void main(String[] args) {
        // Помещаем в константы исходные данные
        final int START_NUM=1;
        final int END_NUM=99;
        int i=START_NUM;
        // Основной код
        while (i<=END_NUM) {
            if (i%2!=0) {
                System.out.println(i);
            }
            i++;
        }
    }
}
