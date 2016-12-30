package com.test;
import java.util.ArrayList;
/**
 * Задача 4
 * Создайте массив из всех нечётных чисел от 1 до 99,
 * выведите его на экран в строку, а затем этот же массив
 * выведите на экран тоже в строку,
 * но в обратном порядке (99 97 95 93 … 7 5 3 1).
 */

/**
* На мой взгляд в этой задаче удобнее использовать ArrayList,
 * так как мы не знаем заранее какой будет размер у конечного массива
 *
*/
public class task_4_alternative {
    public static void main(String[] args) {
        // Помещаем в константы исходные данные
        final int START_NUM=1;
        final int END_NUM=99;
        // Создаю список нечетных чисел
        int i;
        ArrayList numbers = new ArrayList();
        // Прохожу по всему исходному диапазону и наполняю список нечетными числами
        // При этом формирую стоку для дальнейшего вывода значений на экран, чтобы не делать
        // лишний цикл
        String result="";
        for (i=START_NUM;i<=END_NUM;i++) {
            if (i % 2 != 0) {
                numbers.add(i);
                result+=" "+i;
            }
        }
        // вывожу строку чисел
        System.out.println(result);

        // Формирую строку и вывожу наш список в обратном порядке
        result="";
        for (i = numbers.size()-1; i>=0; i--) {
            result+= numbers.get(i) + " ";
        }
        System.out.println(result);

    }
}

