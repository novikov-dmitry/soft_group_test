package com.test;

import java.util.Arrays;

/**
 * Задача 4
 * Создайте массив из всех нечётных чисел от 1 до 99,
 * выведите его на экран в строку, а затем этот же массив
 * выведите на экран тоже в строку,
 * но в обратном порядке (99 97 95 93 … 7 5 3 1).
 */

public class task_4 {
    public static void main(String[] args) {
        // Помещаем в константы исходные данные
        final int START_NUM=1;
        final int END_NUM=99;
        // Инициализируем дополнительные переменные
        int i;
        int elements_count=0;
        // Подсчитываю сколько в исходном массиве нечетных чисел для того,
        // чтобы задать размер будущего массива
        for (i=START_NUM;i<=END_NUM;i++) {
            if (i % 2 != 0) {
                elements_count++;
            }
        }
        // Создаю массив нужного размера
        int[] nums= new int[elements_count];
        int counter=0;
        // Делаю второй проход по исходному диапазону чисел и заполняю наш массив элементами
        // При этом формирую стоку для дальнейшего вывода значений на экран, чтобы не делать
        // лишний цикл
        String result="";
        for (i=START_NUM;i<=END_NUM;i++) {
            if (i % 2 != 0) {
                nums[counter]=i;
                result+=" "+i;
                counter++;
            }
        }
        // вывожу строку чисел
        System.out.println(result);
        // Формирую строку и вывожу наш список в обратном порядке
        result="";
        for (i=nums.length-1;i>=0;i--) {
            result+=" "+nums[i];
        }
        System.out.println(result);

    }
}

