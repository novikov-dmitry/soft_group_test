package com.test;

/**
 * Задача 5
 * Создайте массив из 20-ти первых чисел Фибоначчи и выведите его на экран.
 * Напоминаем, что первый и второй члены последовательности равны единицам,
 * а каждый следующий — сумме двух предыдущих.
 */

public class task_5 {
    public static void main(String[] args) {
        // Помещаем в константы исходные данные
        final int NUMS_COUNT=20;
        // Создаем результирующий массив
        int[] nums= new int[20];
        // Наполняем массив числами Фибоначчи
        for (int i = 0; i<=nums.length-1; i++) {
            if (i<2) nums[i]=1;
            else nums[i]=nums[i-1]+nums[i-2];
            //result+= nums[i] + " ";
        }
        // Выводим  массив
        String result="";
        for (int i = 0; i<=nums.length-1; i++) {
            result+= nums[i] + " ";
        }
        System.out.println(result);

    }
}

