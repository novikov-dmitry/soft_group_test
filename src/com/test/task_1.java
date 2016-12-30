package com.test;

/**
 * Задача 1
 * При помощи цикла for вывести на экран нечетные числа от 1 до 99
 */
public class task_1 {
    public static void main(String[] args) {
        // Помещаем в константы исходные данные
        final int START_NUM=1;
        final int END_NUM=99;
        // Инициализируем дополнительные переменные
        int i;
        // Запускаем основной цикл
        for (i=START_NUM;i<=END_NUM;i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}

