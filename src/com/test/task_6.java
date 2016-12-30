package com.test;

/**
 * Задача 6
 * Создать двумерный массив из 8 строк по 5 столбцов в каждой
 * из случайных целых чисел из отрезка *10;99+.
 * Вывести массив на экран
 */

public class task_6 {
    public static void main(String[] args) {
        // Помещаем в константы исходные данные
        final int ROWS_COUNT=8;
        final int COLS_COUNT=5;
        // Создаем двумерный массив и наполняем его элементами
        int[][] nums= new int[ROWS_COUNT][COLS_COUNT];
        for (int r = 0; r<ROWS_COUNT; r++) {
            for (int c = 0; c<COLS_COUNT; c++) {
                nums[r][c]= (int)(Math.random()*10+99);   ///  надо почитать про функцию!!!! и параметры
            }
        }
        // Выводим  результат
        for (int r = 0; r<=nums.length-1; r++) {
            String row="";
            for (int c = 0; c<=nums[r].length-1; c++) {
                row+=nums[r][c]+" ";
            }
            System.out.println(row);
        }
    }
}

