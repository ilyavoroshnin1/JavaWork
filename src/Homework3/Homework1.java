package Homework3;

import java.awt.font.FontRenderContext;

public class Homework1 {
    public static void main(String[] args) {
        /**
         * Есть массив цифр (задайте его сами). Вывести на консоль:
         * 1) Сколько в массиве четных цифр?
         */

        int[] numbers = {1, 4, 7, 12, 4000, 3, 5, 800, 9998};

        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] % 2 == 0){
                System.out.println(numbers[i]);

            }
        }
    }
}
