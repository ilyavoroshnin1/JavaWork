package Homework3;

public class Homework2 {
    public static void main(String[] args) {
        /**
         * Домашнее задание на среду:
         * Есть массив цифр (задайте его сами). Вывести на консоль:
         * 2) Все числа с массива, которые больше 10, но меньше 25.
         */

        int[] numbers = {1, 4, 7, 12, 4000, 3, 5, 800, 9998};

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 10 && numbers[i] < 25) {
                System.out.println(numbers[i]);
            }
        }
    }
}