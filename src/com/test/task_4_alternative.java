package com.test;
import java.util.ArrayList;

/***********************************************************
 *
 * Задача 4
 * (Альтернативное решение с использованием ArrayList)
 * Создайте массив из всех нечётных чисел от 1 до 99,
 * выведите его на экран в строку, а затем этот же массив
 * выведите на экран тоже в строку,
 * но в обратном порядке (99 97 95 93 … 7 5 3 1).
 *
 **********************************************************/

public class task_4_alternative {
    public static void main(String[] args) {

        // Помещаем исходные данные в константы
        final int START_NUM=1;
        final int END_NUM=99;


        // Объявляю и инициализирую ArrayList
        ArrayList numbers = new ArrayList();
        // Прохожу по всему исходному диапазону чисел и наполняю ArrayList нечетными числами
        // При этом формирую стоку для дальнейшего вывода значений на экран, чтобы не делать лишний цикл
        String result="";
        for (int i=START_NUM;i<=END_NUM;i++) {
            if (i % 2 != 0) {
                numbers.add(i);
                result+=" "+i;
            }
        }
        // вывожу строку чисел
        System.out.println(result);
        // Вывожу наш список в переменную  result обратном порядке после чего печатаю на экране
        result="";
        for (int i = numbers.size()-1; i>=0; i--) {
            result+= numbers.get(i) + " ";
        }
        System.out.println(result);
    }
}

