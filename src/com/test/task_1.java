package com.test;

/******************************************************************************
 *
 * Задача 1.
 * При помощи цикла for вывести на экран нечетные числа от 1 до 99
 *
 *****************************************************************************/
public class task_1 {
    public static void main(String[] args) {

        // Помещаем  исходные данные в константы, чтобы проще было их менять при необходимости
        final int START_NUM=1;
        final int END_NUM=99;


        // Запускаем цикл
        for (int i=START_NUM;i<=END_NUM;i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}

